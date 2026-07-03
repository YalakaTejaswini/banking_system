package org.example.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UTRGenerator {

    private static int counter = 1;

    public static String generateUTR() {

        String date = LocalDate.now()
                .format(DateTimeFormatter.ofPattern("yyyyMMdd"));

        return "SBI" + date + String.format("%06d", counter++);
    }
}