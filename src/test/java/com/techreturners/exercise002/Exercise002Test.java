package com.techreturners.exercise002;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Exercise002Test {

    private Exercise002 ex002;

    @Before
    public void setUp() {
        ex002 = new Exercise002();
    }

    @Test
    public void checkIsFromManchester() {
        Person p1 = new Person("Peter", "Smith", "Manchester", 23);
        Person p2 = new Person("Susan", "Farmer", "Leeds", 23);
        Person p3 = new Person("Susan", "Farmer", "", 23);

        assertEquals(true, ex002.isFromManchester(p1));
        assertEquals(false, ex002.isFromManchester(p2));
        assertEquals(false, ex002.isFromManchester(p2));
    }

    @Test
    public void checkCanWatchFilm() {
        Person p1 = new Person("Peter", "Smith", "Manchester", 17);
        Person p2 = new Person("Francis", "Farmer", "Leeds", 18);

        assertEquals(false, ex002.canWatchFilm(p1, 18 ));
        assertEquals(true, ex002.canWatchFilm(p2, 18 ));
        assertEquals(false, ex002.canWatchFilm(null, 18 ));
    }
}
