package com.tsm.db.pokemon.model;

import lombok.Data;

@Data
public class Vendita {


    private String dataVendita;
    private String piattaformaVendita;
    private Double prezzoVendita;
    private Double costi;
    private Double netto; // prezzo vendita - costi - prezzo acquisto
    private String idVendita;
}
