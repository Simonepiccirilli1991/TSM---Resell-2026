package com.tsm.db.pokemon.model.request;

import com.tsm.db.pokemon.exception.PkmException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ObjectUtils;

import java.time.LocalDateTime;

@Slf4j
public record AddPkmSealedRequest(
        String nome,
        Integer quantita,
        LocalDateTime dataAcquisto,
        Double costoAcquisto,
        String codiceProdotto,
        String espansione,
        String acquistatoPresso) {



    public void validateRequest(){

        if(ObjectUtils.isEmpty(nome) || ObjectUtils.isEmpty(quantita) || ObjectUtils.isEmpty(dataAcquisto)
        || ObjectUtils.isEmpty(costoAcquisto) || ObjectUtils.isEmpty(codiceProdotto) || ObjectUtils.isEmpty(espansione)){
            log.info("Error on validateRequest PkmSealed, missing requested parameter");
            throw new PkmException("PKM-400","Invalid request, missing parameter");
        }
    }
}
