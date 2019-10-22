package com.java8.mod14.osservatorio.test;

import com.java8.mod14.osservatorio.dati.Partecipante;
import com.java8.mod14.osservatorio.dati.Telescopio;

public class Osservazione {

    public static void main(String args[]) {
        Telescopio telescopio = new Telescopio();
        Partecipante[] partecipanti = getPartecipanti(telescopio);
        for (Partecipante partecipante : partecipanti) {
            partecipante.start();
        }
    }

    private static Partecipante[] getPartecipanti(Telescopio telescopio) {
        Partecipante[] partecipanti = {new Partecipante("Ciro", telescopio),
            new Partecipante("Gianluca", telescopio),
            new Partecipante("Luigi", telescopio),
            new Partecipante("Piero", telescopio),
            new Partecipante("Nicola", telescopio),
            new Partecipante("Giuseppe", telescopio),
            new Partecipante("Maurizio", telescopio),
            new Partecipante("Pierluigi", telescopio),
            new Partecipante("Pasquale", telescopio),
            new Partecipante("Vincenzo", telescopio)};
        return partecipanti;
    }
}
