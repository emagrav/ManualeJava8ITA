package com.java8.mod14.sportello.test;

import com.java8.mod14.sportello.dati.Richiedente;

public class TestSportello {
    public static void main(String args[]){
        final Richiedente[] richiedenti = getRichiedenti();
        for (Richiedente richiedente : richiedenti) {
            richiedente.start();
        }
    }
    
    private static Richiedente[] getRichiedenti() {
        Richiedente[] partecipanti = {new Richiedente("Ciro"),
            new Richiedente("Gianluca"),
            new Richiedente("Luigi"),
            new Richiedente("Piero"),
            new Richiedente("Nicola"),
            new Richiedente("Giuseppe"),
            new Richiedente("Maurizio"),
            new Richiedente("Pierluigi"),
            new Richiedente("Pasquale"),
            new Richiedente("Vincenzo")};
        return partecipanti;
    }
}
