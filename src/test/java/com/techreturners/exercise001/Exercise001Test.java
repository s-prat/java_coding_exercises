package com.techreturners.exercise001;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class Exercise001Test {

    private Exercise001 ex001;

    @Before
    public void setUp() {
        ex001 = new Exercise001();
    }

    @Test
    public void checkHello() {
        assertEquals("Hello", ex001.capitalizeWord("hello"));
        assertEquals("The quick fox", ex001.capitalizeWord("the quick fox"));
        assertEquals("Oh no, bears!!!", ex001.capitalizeWord("oh no, bears!!!"));
    }

    @Test
    public void testEmptyCapitalizeWord() {
        assertEquals("", ex001.capitalizeWord(""));
    }

    @Test
    public void testBlankCapitalizeWord() {
        assertEquals("", ex001.capitalizeWord("   "));

    }

    @Test
    public void testNullCapitalizeWord() {
        assertEquals(null, ex001.capitalizeWord(null));
    }

    @Test
    public void testSingleCharCapitalizeWord() {
        assertEquals("H", ex001.capitalizeWord("h"));
    }

    @Test
    public void testTwoCharCapitalizeWord() {
        assertEquals("He", ex001.capitalizeWord("he"));
    }

    @Test
    public void checkHelloAlreadyUppercase() {
        Exercise001 ex001 = new Exercise001();
        assertEquals("Hello", ex001.capitalizeWord("Hello"));
    }

    @Test
    public void checkInitials() {
        assertEquals("F.B", ex001.generateInitials("Frederic", "Bonneville"));
        assertEquals("K.M", ex001.generateInitials("Karl", "Marx"));
        assertEquals("L.H", ex001.generateInitials("Lewis", "Hamilton"));
    }

    @Test
    public void testFNameNullCheckInitials() {
        assertEquals("B", ex001.generateInitials(null, "Bonneville"));
    }

    @Test
    public void testLNameNullCheckInitials() {
        assertEquals("F", ex001.generateInitials("Frederic", null));
    }

    @Test
    public void testFNameEmptyCheckInitials() {
        assertEquals("B", ex001.generateInitials("", "Bonneville"));
    }

    @Test
    public void testLNameEmptyCheckInitials() {
        assertEquals("F", ex001.generateInitials("Frederic", ""));
    }

    @Test
    public void testBothNullCheckInitials() {
        assertEquals(null, ex001.generateInitials(null, null));
    }

    @Test
    public void testBothEmptyCheckInitials() {
        assertEquals("", ex001.generateInitials("", ""));
    }

    @Test
    public void checkAddVat() {
        assertEquals(120, ex001.addVat(100, 20), 0.0);
        assertEquals(47, ex001.addVat(40, 17.5), 0.0);
        assertEquals(39.36, ex001.addVat(33.5, 17.5), 0.0);
        assertEquals(25, ex001.addVat(25, 0), 0.0);
    }

    @Test
    public void testAddVatIfOPZero() {
        assertEquals(0, ex001.addVat(0, 20), 0.0);
    }

    @Test
    public void testAddVatIfVRZero() {
        assertEquals(100, ex001.addVat(100, 0), 0.0);
    }

    @Test
    public void testAddVatIfBothZero() {
        assertEquals(0, ex001.addVat(0, 0), 0.0);
    }

    @Test
    public void checkSentenceReverse() {
        Exercise001 ex001 = new Exercise001();
        assertEquals("oof", ex001.reverse("foo"));
        assertEquals("?siht od ot tnaw neve uoy dluow yhw", ex001.reverse("why would you even want to do this?"));
    }

    @Test
    public void checkLinuxUsers() {
        Exercise001 ex001 = new Exercise001();
        User u1 = new User("Heather", "Windows 10", "Windows");
        User u2 = new User("Paul", "Windows 95", "Windows");
        User u3 = new User("Sheila", "CentOS 7", "Linux");
        User u4 = new User("Pedro", "Ubuntu 18.04", "Linux");


        List<User> users = new ArrayList<User>();
        users.add(u1);
        users.add(u2);
        assertEquals(0, ex001.countLinuxUsers(users));

        users = new ArrayList<User>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        assertEquals(2, ex001.countLinuxUsers(users));
    }
}
