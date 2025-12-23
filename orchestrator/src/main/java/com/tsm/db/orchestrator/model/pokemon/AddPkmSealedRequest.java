package com.tsm.db.orchestrator.model.pokemon;

import java.time.LocalDateTime;

public record AddPkmSealedRequest(
        String nome,
        Integer quantita,
        LocalDateTime dataAcquisto,
        Double costoAcquisto,
        String codiceProdotto,
        String espansione,
        String acquistatoPresso
) {
}
