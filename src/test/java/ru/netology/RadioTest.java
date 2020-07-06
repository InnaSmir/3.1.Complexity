package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldGetAndSetCurrentRadioStation() {

        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(4);
        assertEquals(4, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(9);
        assertEquals(9, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(10);
        assertEquals(9, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(-1);
        assertEquals(9, radio.getCurrentRadioStation());
    }
    @Test
    public void shouldGetAndSetMaxNumberRadioStation() {
        radio.setMaxNumberRadioStation(9);
        assertEquals(9, radio.getMaxNumberRadioStation());

        radio.setMaxNumberRadioStation(8);
        assertEquals(8, radio.getMaxNumberRadioStation());
    }

    @Test
    public void shouldGetAndSetMinNumberRadioStation() {
        radio.setMinNumberRadioStation(9);
        assertEquals(9, radio.getMinNumberRadioStation());

        radio.setMinNumberRadioStation(8);
        assertEquals(8, radio.getMinNumberRadioStation());
    }
}
