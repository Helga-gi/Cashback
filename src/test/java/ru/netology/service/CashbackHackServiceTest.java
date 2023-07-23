package ru.netology.service;

public class CashbackHackServiceTest {
    @org.junit.Test
    public void shouldRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldRemainIfLess() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;
        org.junit.Assert.assertEquals(expected, actual);
    }
}
