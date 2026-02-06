package kz.kaspilab.service2.controller;

import kz.kaspilab.service2.dto.EnrichmentDto;
import kz.kaspilab.service2.service.EnrichmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/enrichment")
public class EnrichmentController {

    private final EnrichmentService service;

    public EnrichmentController(EnrichmentService service) {
        this.service = service;
    }


    @GetMapping
    public ResponseEntity<EnrichmentDto> get(@RequestParam String clientId,
                                             @RequestParam String category) {
        return ResponseEntity.ok(service.get(clientId, category));
    }


    @PostMapping("/active")
    public ResponseEntity<Void> setActive(@RequestParam String clientId,
                                          @RequestParam String category) {
        service.setActive(clientId, category);
        return ResponseEntity.ok().build();
    }

    // тестовый: очистить
    @DeleteMapping("/active")
    public ResponseEntity<Void> clear(@RequestParam String clientId,
                                      @RequestParam String category) {
        service.clearActive(clientId, category);
        return ResponseEntity.noContent().build();
    }
}