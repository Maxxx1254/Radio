package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    @Test
    public void testOverMinSetCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);

        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(5);

        int expected = 5;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testOverMaxSetCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);

        int expected = 10;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testAfterMaximalStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);

        int expected = 0;
        int actual = rad.getNextCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testNextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(4);

        int expected = 5;
        int actual = rad.getNextCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testDownLimitPrevStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);

        int expected = 9;
        int actual = rad.getPrevCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testInLimitPrevStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);

        int expected = 8;
        int actual = rad.getPrevCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testUpOverLimitVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);

        int expected = 10;
        int actual = rad.getUpCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testUpInLimitVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        int expected = 1;
        int actual = rad.getUpCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testDownOverLimitVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        int expected = 0;
        int actual = rad.getDownCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testDownInLimitVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(7);

        int expected = 6;
        int actual = rad.getDownCurrentVolume();

        assertEquals(expected, actual);
    }
}