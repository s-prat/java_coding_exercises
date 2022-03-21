package com.techreturners.exercise002;

public class Exercise002 {

    private static final String CITY_NAME = "Manchester";

    public boolean isFromManchester(Person person) {
        return person != null && (CITY_NAME).equalsIgnoreCase(person.getCity());
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        return person != null && ageLimit <= person.getAge();
    }
    
}
