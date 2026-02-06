package kz.kaspilab.service2.dto;

public class EnrichmentDto {
    private String clientId;
    private boolean hasActiveSameCategory;

    public EnrichmentDto() {}

    public EnrichmentDto(String clientId, boolean hasActiveSameCategory) {
        this.clientId = clientId;
        this.hasActiveSameCategory = hasActiveSameCategory;
    }

    public String getClientId() { return clientId; }
    public void setClientId(String clientId) { this.clientId = clientId; }

    public boolean isHasActiveSameCategory() { return hasActiveSameCategory; }
    public void setHasActiveSameCategory(boolean hasActiveSameCategory) {
        this.hasActiveSameCategory = hasActiveSameCategory;
    }
}