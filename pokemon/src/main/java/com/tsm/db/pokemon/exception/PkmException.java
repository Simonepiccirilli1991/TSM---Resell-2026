package com.tsm.db.pokemon.exception;

import lombok.Data;

@Data
public class PkmException extends RuntimeException{

    private String codice;
    private String messaggio;

    public PkmException(String codice, String messaggio) {
        this.codice = codice;
        this.messaggio = messaggio;
    }
}
