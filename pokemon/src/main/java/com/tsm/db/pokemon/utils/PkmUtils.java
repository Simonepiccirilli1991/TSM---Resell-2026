package com.tsm.db.pokemon.utils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PkmUtils {

    private static  final String pkmSealedPrefix = "PKM-SEAL";
    private static final String pkmCardPrefix = "PKM-CARD";



    public static String generatePkmSealedId(String dataAcquisto){
        return pkmSealedPrefix + "-"+(dataAcquisto.hashCode());
    }

    public static String generatePkmCardId(String dataAcquisto){
       return pkmCardPrefix + "-"+(dataAcquisto.hashCode());
    }
}
