package com.java8.mod13.utils;

public enum LinguaEnum {

    ITALIANO("it"), INGLESE("en");

    private final String chiave;

    private LinguaEnum(String chiave) {
        this.chiave = chiave;
    }

    public String getChiave() {
        return chiave;
    }

}
