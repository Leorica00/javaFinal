package org.example.quiz4.task2Enum;

public enum DaysOfWeek {
    MONDAY("Mon", 1),
    TUESDAY("Tue", 2),
    WEDNESDAY("Wed", 3),
    THURSDAY("Thu", 4),
    FRIDAY("Fri", 5),
    SATURDAY("Sat", 6),
    SUNDAY("Sun", 7);

    private final String shortName;
    private final int dayNumber;

    DaysOfWeek(String shortName, int dayNumber) {
        this.shortName = shortName;
        this.dayNumber = dayNumber;
    }

    public String getShortName() {
        return shortName;
    }

    public int getDayNumber() {
        return dayNumber;
    }


    public DaysOfWeek getNextDay() {
        int nextOrdinal = (this.ordinal() + 1) % 7;
        return values()[nextOrdinal];
    }

    public DaysOfWeek getPreviousDay() {
        int previousOrdinal = (this.ordinal() + 6) % 7;
        return values()[previousOrdinal];
    }

    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }

    public boolean isWeekday() {
        return !isWeekend();
    }
}
