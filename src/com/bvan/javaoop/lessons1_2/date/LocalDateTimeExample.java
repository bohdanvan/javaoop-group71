package com.bvan.javaoop.lessons1_2.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author bvanchuhov
 */
public class LocalDateTimeExample {

    public static void main(String[] args) {
        int x = 10;

        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDate now = LocalDate.now();
        LocalDate nowYearAgo = now.minusYears(1);
        DayOfWeek dayOfWeekYearAgo = nowYearAgo.getDayOfWeek();
        System.out.println(dayOfWeekYearAgo);

        System.out.println(LocalDate.now().minusYears(1).getDayOfWeek());

        System.out.println(LocalDate.now().minusYears(98).isLeapYear());
    }
}
