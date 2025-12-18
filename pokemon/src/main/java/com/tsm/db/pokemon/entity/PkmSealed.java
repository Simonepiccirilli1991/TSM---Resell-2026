package com.tsm.db.pokemon.entity;

import com.tsm.db.pokemon.model.Vendita;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("Pokemon-sealed")
public class PkmSealed {

    @Id
    private String id;
    private String nome;
    private String insertDate;
    private String dataAcquisto;
    private String dataLastUpdate;
    private String status;
    private Double costoAcquisto;
    private String codiceProdotto;
    private String espansione;
    private String acquistatoPresso;
    private Vendita vendita;
}
