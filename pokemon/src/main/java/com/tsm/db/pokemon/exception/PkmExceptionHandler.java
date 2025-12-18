package com.tsm.db.pokemon.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class PkmExceptionHandler {

    @ExceptionHandler(PkmException.class)
    public ResponseEntity<PkmError> pkmHandler(PkmException e){
        return ResponseEntity.internalServerError().body(new PkmError(e.getCodice(), e.getMessaggio()));
    }
}
