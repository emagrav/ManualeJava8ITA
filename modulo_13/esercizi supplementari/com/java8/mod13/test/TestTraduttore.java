package com.java8.mod13.test;

import com.java8.mod13.utils.LinguaEnum;
import com.java8.mod13.utils.ParoleEnum;
import com.java8.mod13.utils.Traduttore;

public class TestTraduttore {

    public static void main(String args[]) {
        Traduttore traduttore = new Traduttore();
        String parolaTradotta = traduttore.traduci(ParoleEnum.LIBRO, LinguaEnum.INGLESE);
        System.out.println(parolaTradotta);
    }

}
