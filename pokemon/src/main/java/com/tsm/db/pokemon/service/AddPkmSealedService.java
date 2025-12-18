package com.tsm.db.pokemon.service;


import com.tsm.db.pokemon.entity.PkmSealed;
import com.tsm.db.pokemon.model.request.AddPkmSealedRequest;
import com.tsm.db.pokemon.model.response.AddPkmReponse;
import com.tsm.db.pokemon.repository.PkmSealedRepo;
import com.tsm.db.pokemon.utils.PkmUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

@Service
@Slf4j
@RequiredArgsConstructor
public class AddPkmSealedService {

    private final PkmSealedRepo pkmSealedRepo;


    public AddPkmReponse addPkmSealedService(AddPkmSealedRequest request){
        log.info("AddPkmSealedService started with raw request: {}",request);

        // valido la request
        request.validateRequest();
        // setto lista delle entity
        var entitys = new ArrayList<PkmSealed>();

        // mappo su entity la request, sono n entity tatne quante sono le quantità
        for(var i = 0; i <= request.quantita(); i++){

            var dataId = request.dataAcquisto().plusSeconds(i);
            var id = PkmUtils.generatePkmSealedId(dataId.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

            var entity = new PkmSealed();
            entity.setId(id);
            entity.setNome(request.nome());
            entity.setEspansione(request.espansione());
            entity.setStatus("ACQUISTATO");
            entity.setAcquistatoPresso(request.acquistatoPresso());
            entity.setCodiceProdotto(request.codiceProdotto());
            entity.setCostoAcquisto(request.costoAcquisto());
            entity.setDataAcquisto(request.dataAcquisto().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
            entity.setInsertDate(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
            entity.setDataLastUpdate(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
            // addo alla lista
            entitys.add(entity);
        }
        // posso salvare a db la lista
        pkmSealedRepo.saveAll(entitys);
        // setto reponse
        var response = new AddPkmReponse("Salvato con successo",null,entitys.getFirst(), request.quantita());
        log.info("AddPkmSealedService ended successfully with response: {}",response);
        return response;
    }
}
