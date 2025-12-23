package com.tsm.db.orchestrator.client;

import com.tsm.db.orchestrator.model.pokemon.AddPkmResponse;
import com.tsm.db.orchestrator.model.pokemon.AddPkmSealedRequest;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

@HttpExchange( url = "http://localhost:8080/api/v1/pkm")
public interface PkmClientRest {


    @PostExchange("sealed/add")
    AddPkmResponse addCartaSealed(AddPkmSealedRequest request, @RequestHeader("tracing-Id") String tracingId);

}
