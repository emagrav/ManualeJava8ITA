package com.java8.mod15.osservatorio.dati;

public enum Stato {
    IN_ATTESA("\"Sono in attesa...\""), OSSERVAZIONE("\"Tocca a me... che meraviglia!\""), FINITO("\"Ho finito.\"");
    
    private String messaggio;

    private Stato(String messaggio) {
        this.messaggio = messaggio;
    }

    public String getMessaggio() {
        return messaggio;
    }

}
