package com.java8.mod15.test;

import com.java8.mod15.dati.Persona;


public class TestPersona {

    public static void main(String args[]) {
        System.out.println(new Persona("Arjen Anthony", "Lucassen", "03/04/1960", "Compositore", "Olanda") {

            @Override
            public String toString() {
                String string = "Nome: \t\t\t" + getNome();
                string += "\nCognome: \t\t" + getCognome();
                string += "\nProfessione: \t\t" + getProfessione();
                string += "\nData di Nascita: \t" + getDataDiNascita();
                string += "\nIndirizzo: \t\t" + getIndirizzo();
                return string;
            }

        });
    }
}
