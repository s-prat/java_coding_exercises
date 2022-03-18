package com.techreturners.exercise005;


public class Exercise005 {

    public boolean isPangram(String input) {
        if(input != null && !input.isEmpty()) {
            long lettersCount = input.toLowerCase().chars().filter(c -> c >= 'a' && c <= 'z').distinct().count();

            if (lettersCount == 26) {
                return true;
            }
        }

        return false;
    }

}
