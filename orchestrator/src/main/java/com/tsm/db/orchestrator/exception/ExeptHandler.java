package com.tsm.db.orchestrator.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExeptHandler {


    @ExceptionHandler(PkmException.class)
    public ResponseEntity<OrcError> pkmExceptHandler(PkmException e){
        return ResponseEntity.internalServerError().body(new OrcError(e.getCodiceErrore(),e.getMessaggioErrore(),"PKM-500"));
    }
}
