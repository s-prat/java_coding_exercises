package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {

    private static final long GIGASECOND = 1000000000;
    private LocalDateTime dateTime;


    public Exercise004(LocalDate date) {
        this.dateTime = date.atStartOfDay();
    }

    public Exercise004(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return dateTime.plusSeconds(GIGASECOND);
    }
}
