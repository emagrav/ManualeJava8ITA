package com.java8.mod16.eccezioni;

public class DuplicatoException extends RuntimeException {

    public DuplicatoException(Object elementoDuplicato) {
        super("Impossibile aggiungere l'elemento \""
                + elementoDuplicato + "\" perché già presente");
    }

}
