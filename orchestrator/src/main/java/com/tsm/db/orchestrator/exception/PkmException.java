package com.tsm.db.orchestrator.exception;

import lombok.Data;

@Data
public class PkmException extends RuntimeException{

    private String codiceErrore;
    private String messaggioErrore;

    public PkmException(String codiceErrore, String messaggioErrore) {
        this.codiceErrore = codiceErrore;
        this.messaggioErrore = messaggioErrore;
    }
}
