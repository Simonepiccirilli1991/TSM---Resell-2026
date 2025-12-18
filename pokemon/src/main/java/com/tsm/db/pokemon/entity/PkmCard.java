package com.tsm.db.pokemon.entity;


import com.tsm.db.pokemon.model.Vendita;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("Pokemon-card")
public class PkmCard {

    @Id
    private String id;
    private String nome;
    private String codice;
    private Boolean gradata;
    private String casaGradazione;
    private String votoGradazione;
    private Double costoAcquisto;
    private String piattaformaAcquisto;
    private String dataAcquisto;
    private String dataInserimento;
    private String dataLastUpdate;
    private Vendita vendita;
}
