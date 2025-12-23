package com.tsm.db.orchestrator.model.pokemon;

public record PkmSealed(
        String id,
        String nome,
        String insertDate,
        String dataAcquisto,
        String dataLastUpdate,
        String status,
        Double costoAcquisto,
        String codiceProdotto,
        String espansione,
        String acquistatoPresso
) {
}
