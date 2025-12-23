package com.tsm.db.orchestrator.model.pokemon;

public record AddPkmResponse(

        String messaggio,
        PkmCard cartaPokemon,
        PkmSealed prodottoPokemon,
        Integer quantita
) {
}
