package com.java8.mod13.utils;

import java.util.Locale;
import java.util.ResourceBundle;

public class Traduttore {
        
     public static String traduci(ParoleEnum testo, LinguaEnum lingua) {
         String chiaveLingua = lingua.getChiave();
         Locale locale = new Locale(chiaveLingua);
         ResourceBundle resources = ResourceBundle.getBundle("risorse.vocabolario", locale);
         final String traduzione = resources.getString(testo.getChiave());
         return traduzione;
     }
}
