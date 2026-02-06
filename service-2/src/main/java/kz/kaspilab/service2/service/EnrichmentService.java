package kz.kaspilab.service2.service;

import kz.kaspilab.service2.dto.EnrichmentDto;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class EnrichmentService {

    private final StringRedisTemplate redis;

    public EnrichmentService(StringRedisTemplate redis) {
        this.redis = redis;
    }

    // key: "active:{clientId}:{category}" => "1"
    public EnrichmentDto get(String clientId, String category) {
        String key = "active:" + clientId + ":" + category;
        boolean hasActive = redis.hasKey(key) != null && Boolean.TRUE.equals(redis.hasKey(key));
        return new EnrichmentDto(clientId, hasActive);
    }

    // для теста руками: поставить активное обращение
    public void setActive(String clientId, String category) {
        String key = "active:" + clientId + ":" + category;
        redis.opsForValue().set(key, "1");
    }

    public void clearActive(String clientId, String category) {
        String key = "active:" + clientId + ":" + category;
        redis.delete(key);
    }
}