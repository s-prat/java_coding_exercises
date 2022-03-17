package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        if(word != null) {
            int length = word.trim().length();
            if (word.length() > 1) {
                return word.substring(0).toUpperCase().concat(word.substring(1, word.length()));
            } else if (word.length() == 1) {
                return word.substring(0).toUpperCase();
            } else {
                return "";
            }
        }
        return null;
    }

    public String generateInitials(String firstName, String lastName) {
        String result = null;
        if(firstName != null) {
            int firstNameLength = firstName.length();
            if(firstNameLength > 0) {
                result = firstName.substring(0);
            } else {
                result = "";
            }

        }
        if(lastName != null) {
            int lastNameLength = lastName.length();
            if(lastNameLength > 0 && result != null && !result.isEmpty()) {
                result = result.concat(".").concat(lastName.substring(0));
            } else if(lastNameLength > 0) {
                result = lastName.substring(0);
            }
        }
        return result;
    }

    public double addVat(double originalPrice, double vatRate) {
        if(originalPrice != 0 && vatRate != 0) {
            return originalPrice + (originalPrice/vatRate);
        } else if (originalPrice != 0 && vatRate == 0) {
            return originalPrice;
        }
        return 0.0;
    }

    public String reverse(String sentence) {
        // Add your code here
        return "";
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        return 0;
    }
}
