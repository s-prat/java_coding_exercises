package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        if(word != null) {
            int length = word.trim().length();
            if (word.length() > 1) {
                return String.valueOf(word.charAt(0)).toUpperCase().concat(word.substring(1, word.length()));
            } else if (word.length() == 1) {
                return String.valueOf(word.charAt(0)).toUpperCase();
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
                result = String.valueOf(firstName.charAt(0));
            } else {
                result = "";
            }

        }
        if(lastName != null) {
            int lastNameLength = lastName.length();
            if(lastNameLength > 0 && result != null && !result.isEmpty()) {
                result = result.concat(".").concat(String.valueOf(lastName.charAt(0)));
            } else if(lastNameLength > 0) {
                result = String.valueOf(lastName.charAt(0));
            }
        }
        return result;
    }

    public double addVat(double originalPrice, double vatRate) {
        if(originalPrice != 0 && vatRate != 0) {
            return Double.valueOf(String.format("%.2f", originalPrice + (originalPrice*vatRate/100)));
        } else if (originalPrice != 0 && vatRate == 0) {
            return originalPrice;
        }
        return 0.0;
    }

    public String reverse(String sentence) {
        if(sentence != null && !sentence.isEmpty()) {
            char[] charArr = sentence.toCharArray();
            int l = charArr.length;
            char[] reversedCharArr = new char[l];
            if (l > 0) {
                for(int i=0, j=l-1;i<l && j>=0;i++, j--)
                {
                    reversedCharArr[i] = charArr[j];
                }
            }
            return String.valueOf(reversedCharArr);
        }
        return "";
    }

    public int countLinuxUsers(List<User> users) {
        if(users != null && !users.isEmpty()) {
            return (int) users.stream().filter(u -> u.getType().equalsIgnoreCase("Linux")).count();
        }
        return 0;
    }
}
