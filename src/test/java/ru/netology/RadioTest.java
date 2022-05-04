package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    @Test
    public void testOverMinSetCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);

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

        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testAfterMaximalStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);

        rad.nextCurrentStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testNextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(4);

        rad.nextCurrentStation();

        int expected = 5;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testDownLimitPrevStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);

        rad.prevCurrentStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testInLimitPrevStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);

        rad.prevCurrentStation();

        int expected = 8;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testUpOverLimitVolume() {
        Radio rad = new Radio(4);
        rad.setCurrentVolume(100);

        rad.upCurrentVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testUpInLimitVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.upCurrentVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testDownOverLimitVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.downCurrentVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testDownInLimitVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(7);

        rad.downCurrentVolume();

        int expected = 6;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void testLimitStation(){
        Radio rad = new Radio(20);
        rad.setCurrentStation(15);

        int expected = 15;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testOverLimitStation(){
        Radio rad = new Radio(20);
        rad.setCurrentStation(22);


        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }
}