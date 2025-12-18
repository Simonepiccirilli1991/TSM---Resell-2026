package com.tsm.db.pokemon.model.response;

import com.tsm.db.pokemon.entity.PkmCard;
import com.tsm.db.pokemon.entity.PkmSealed;

public record AddPkmReponse(
        String messaggio,
        PkmCard cartaPokemon,
        PkmSealed prodottoPokemon,
        Integer quantita) {
}
