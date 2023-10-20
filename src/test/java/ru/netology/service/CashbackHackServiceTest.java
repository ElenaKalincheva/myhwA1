package ru.netology.service;

import ru.netology.service.CashbackHackService;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {

    @org.junit.Test
    public void Cashback() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void Cashback2() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

}
