package com.java8.mod13.utils;

import java.time.DateTimeException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class DateUtils {

    public static long getIntervallo(Instant instant1, Instant instant2, ChronoUnit chronoUnit) {
        return chronoUnit.between(instant1, instant2);
    }

    public static long getTempoPassato(Instant instant1, ChronoUnit chronoUnit) {
        return getIntervallo(instant1, Instant.now(), chronoUnit);
    }

    public static String oraEsatta() {
        LocalTime ora = LocalTime.now();
        String oraEsatta = (ora.getHour() + ":" + ora.getMinute() + " " + ora.getSecond());
        return oraEsatta;
    }

    public static String formattaData(LocalDateTime localDateTime, String pattern) throws DateTimeException {
        String formattedDate = null;
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
            formattedDate = formatter.format(localDateTime);
        } catch (DateTimeException dateTimeException) {
            dateTimeException.printStackTrace();
            throw dateTimeException;
        }
        return formattedDate;
    }

    public static LocalDate analizzaData(String data, String pattern) throws DateTimeParseException {
        LocalDate localDate = null;
        try {
            localDate = LocalDate.parse(data, DateTimeFormatter.ofPattern(pattern));
        } catch (DateTimeParseException dateTimeParseException) {
            dateTimeParseException.printStackTrace();
            throw dateTimeParseException;
        }
        return localDate;
    }
}
