package com.java8.mod14.osservatorio.dati;

import com.java8.mod14.osservatorio.metadati.Stato;

public class Telescopio {

    public synchronized void permettiOsservazione(Partecipante partecipante) {
        partecipante.setStato(Stato.OSSERVAZIONE);
        partecipante.stato();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        partecipante.setStato(Stato.FINITO);
        partecipante.stato();
    }
}
