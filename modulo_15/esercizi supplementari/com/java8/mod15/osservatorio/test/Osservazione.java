package com.java8.mod15.osservatorio.test;

import com.java8.mod15.osservatorio.dati.Partecipante;
import com.java8.mod15.osservatorio.dati.Telescopio;

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
            new Partecipante("Nicola", telescopio) {

                @Override
                public void run() {
                    System.out.println(getNome() + " sono pronto!");
                    super.run();
                }

            },
            new Partecipante("Giuseppe", telescopio),
            new Partecipante("Maurizio", telescopio),
            new Partecipante("Pierluigi", telescopio),
            new Partecipante("Pasquale", telescopio),
            new Partecipante("Vincenzo", telescopio)};
        return partecipanti;
    }
}
