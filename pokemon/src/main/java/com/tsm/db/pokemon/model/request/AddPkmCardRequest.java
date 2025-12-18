package com.tsm.db.pokemon.model.request;

import java.time.LocalDateTime;

public record AddPkmCardRequest(
        String nome,
        String codice,
        Boolean gradata,
        String casaGradazione,
        String votoGradazione,
        Double costoAcquisto,
        String piattaformaAcquisto,
        LocalDateTime dataAcquisto
) {
}
