package kz.kaspilab.service1.dto;

import lombok.Data;

@Data
public class EnrichmentRequestDto {

    private String eventId;
    private String clientId;
    private String category;
    private String createdAt;
}