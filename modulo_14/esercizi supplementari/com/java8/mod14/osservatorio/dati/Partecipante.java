package com.java8.mod14.osservatorio.dati;

import com.java8.mod14.osservatorio.metadati.Stato;

public class Partecipante extends Thread {

    private final String nome;

    private Stato stato;

    private final Telescopio telescopio;

    public Telescopio getTelescopio() {
        return telescopio;
    }

    public Partecipante(String nome, Telescopio telescopio) {
        this.nome = nome;
        this.telescopio = telescopio;
        this.setStato(Stato.IN_ATTESA);
        stato();
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void run() {
        telescopio.permettiOsservazione(this);
    }
    
    public void stato(){
        System.out.println(nome + " dice: " + stato.getMessaggio());
    }
}
