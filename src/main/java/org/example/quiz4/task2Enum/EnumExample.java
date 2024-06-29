package org.example.quiz4.task2Enum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnumExample {
    public static void performActionBasedOnDay(DaysOfWeek day) {
        switch (day) {
            case MONDAY -> System.out.println("It's the beginning of the week.");
            case TUESDAY -> System.out.println("It's the Second day of the week.");
            case WEDNESDAY -> System.out.println("It's the middle of the week.");
            case THURSDAY -> System.out.println("It's the fifth day of the week.");
            case FRIDAY -> System.out.println("It's almost the weekend.");
            case SATURDAY -> System.out.println("It's weekend");
            case SUNDAY -> System.out.println("It's weekend.");
        }
    }

    public static void showWeekdays() {
        List<DaysOfWeek> daysList = new ArrayList<>(Arrays.asList(DaysOfWeek.values()));
        System.out.println("Weekdays:");
        for (DaysOfWeek day : daysList) {
            if (day.isWeekday()) {
                System.out.println(day);
            }
        }
    }

    public static void showWeekends() {
        List<DaysOfWeek> daysList = new ArrayList<>(Arrays.asList(DaysOfWeek.values()));
        System.out.println("Weekends:");
        for (DaysOfWeek day : daysList) {
            if (day.isWeekend()) {
                System.out.println(day);
            }
        }
    }
}
