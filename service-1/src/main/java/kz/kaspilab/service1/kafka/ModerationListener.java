package kz.kaspilab.service1.kafka;

import kz.kaspilab.service1.dto.EnrichmentRequestDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ModerationListener {

    private static final Logger log = LoggerFactory.getLogger(ModerationListener.class);

    @KafkaListener(
            topics = "${topic.in}",
            containerFactory = "kafkaListenerContainerFactory"
    )
    public void onMessage(EnrichmentRequestDto event) {
        log.info("Got event from Topic-1: eventId={}, clientId={}, category={}, createdAt={}",
                event.getEventId(), event.getClientId(), event.getCategory(), event.getCreatedAt());
    }
}