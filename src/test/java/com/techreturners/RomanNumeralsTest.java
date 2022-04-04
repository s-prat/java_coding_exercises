package com.techreturners;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {

    private RomanNumerals romanNumerals;

    @BeforeEach
    public void setUp() {
        romanNumerals = new RomanNumerals();
    }

    @Test
    public void testConvertNumberToRoman() {
        //arrange
        int value = 5;
        //act
        String result = romanNumerals.convertNumberToRoman(value);
        //assert
        assertEquals("V", result);
    }
}
