package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setMinNumberRadio() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.next();

        Assertions.assertEquals(1, radio.getCurrentStation());
    }


    @Test
    public void setOverMinNumberRadio() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.next();

        Assertions.assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void setMaxNumberRadio() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void setUnderMaxNumberRadio() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.next();

        Assertions.assertEquals(9, radio.getCurrentStation());
    }


    @Test
    public void shouldPrevMinRadio() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevOverMinRadio() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prev();

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevMaxRadio() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prev();

        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevUnderMaxRadio() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.prev();

        Assertions.assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseVolume();

        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseOverMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.increaseVolume();

        Assertions.assertEquals(2, radio.getCurrentVolume());
    }


    @Test
    public void shouldIncreaseMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }


    @Test
    public void shouldIncreaseUnderMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldReduceMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.reduceVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldReduceOverMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.reduceVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldReduceMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.reduceVolume();

        Assertions.assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void shouldReduceUnderMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.reduceVolume();

        Assertions.assertEquals(98, radio.getCurrentVolume());
    }

}
