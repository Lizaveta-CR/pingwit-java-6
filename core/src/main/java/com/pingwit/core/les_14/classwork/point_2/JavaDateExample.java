package com.pingwit.core.les_14.classwork.point_2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class JavaDateExample {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);

        int year = now.getYear();
        Month month = now.getMonth();
        int monthValue = now.getMonthValue();

        LocalDate myTime = LocalDate.of(2023, 1, 23);
        LocalDate plusYearDate = myTime.plusYears(4);

        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);

        Set<String> availableZones = ZoneId.getAvailableZoneIds();
        System.out.println(availableZones);

        System.out.println(time.atZone(ZoneId.of("Europe/Warsaw")));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String format = dtf.format(now);
        System.out.println(format);

        LocalDate parse = LocalDate.parse("26-Jun-2023", dtf);
        System.out.println(parse);

        DateTimeFormatter dftForLdt = DateTimeFormatter.ofPattern("MM-dd-yyyy 'at' HH:mm:ss");
        System.out.println(dftForLdt.format(LocalDateTime.now()));
    }
}
