package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person) {
        if(person != null && ("Manchester").equalsIgnoreCase(person.getCity())) {
            return true;
        }
        return false;
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        if(person != null && ageLimit <= person.getAge()) {
            return true;
        }
        return false;
    }
    
}
