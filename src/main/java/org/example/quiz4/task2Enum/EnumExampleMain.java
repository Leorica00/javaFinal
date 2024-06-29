package org.example.quiz4.task2Enum;

import static task2.EnumExample.*;

public class EnumExampleMain {

    public static void main(String[] args) {

        performActionBasedOnDay(DaysOfWeek.MONDAY);
        performActionBasedOnDay(DaysOfWeek.TUESDAY);
        performActionBasedOnDay(DaysOfWeek.WEDNESDAY);
        performActionBasedOnDay(DaysOfWeek.THURSDAY);
        performActionBasedOnDay(DaysOfWeek.FRIDAY);
        performActionBasedOnDay(DaysOfWeek.SATURDAY);
        performActionBasedOnDay(DaysOfWeek.SUNDAY);

        showWeekdays();
        showWeekends();
    }
}
