package com.tsm.db.orchestrator.model.pokemon;

public record PkmCard(
        String id,
        String nome,
        String codice,
        Boolean gradata,
        String casaGradazione,
        String votoGradazione,
        Double costoAcquisto,
        String piattaformaAcquisto,
        String dataAcquisto,
        String dataInserimento,
        String dataLastUpdate
) {
}
