package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;
//import org.testng.annotations.Test;

//import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(100);
        int expected = 900;
        assertEquals(actual, expected);

    }

    @Test
    public void testRemainMoreThanMax() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1001);
        int expected = 999;
        assertEquals(actual, expected);

    }

    @Test
    public void testRemainMin() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);

    }

    @Test
    public void testRemainMax() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);

    }
}