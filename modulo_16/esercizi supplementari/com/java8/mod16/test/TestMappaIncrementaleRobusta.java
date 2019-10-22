package com.java8.mod16.test;

import com.java8.mod16.collections.MappaIncrementale;
import com.java8.mod16.collections.MappaIncrementaleRobusta;
import com.java8.mod16.eccezioni.DuplicatoException;

public class TestMappaIncrementaleRobusta {

    public static void main(String args[]) {
        
        MappaIncrementale<Integer, String> mappa = new MappaIncrementaleRobusta<>();
        TestMappaIncrementale.riempiMappaIncrementale(mappa);
        try {
            mappa.add(4, "Grecia");
        } catch (DuplicatoException duplicatoException) {
            System.out.println(duplicatoException.getMessage());
        }
        System.out.println(mappa);
    }
}
