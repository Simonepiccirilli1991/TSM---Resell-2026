package com.tsm.db.pokemon.controller;

import com.tsm.db.pokemon.model.request.AddPkmSealedRequest;
import com.tsm.db.pokemon.model.response.AddPkmReponse;
import com.tsm.db.pokemon.service.AddPkmCardService;
import com.tsm.db.pokemon.service.AddPkmSealedService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/pkm")
@RequiredArgsConstructor
public class PkmController {


    private final AddPkmCardService addPkmCardService;
    private final AddPkmSealedService addPkmSealedService;


    @PostMapping("add/sealed")
    public ResponseEntity<AddPkmReponse> addPokemonSealed(@RequestBody AddPkmSealedRequest request){

    }
}
