package ru.netology;

public class Radio {
    private int currentRadioStation;
    private int maxNumberRadioStation = 9;
    private int minNumberRadioStation = 0;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minNumberRadioStation) {
            return;
        } else if (currentRadioStation > maxNumberRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }
    public int getMaxNumberRadioStation() {

        return maxNumberRadioStation;
    }

    public void setMaxNumberRadioStation(int maxNumberRadioStation) {

        this.maxNumberRadioStation = maxNumberRadioStation;
    }

    public int getMinNumberRadioStation() {

        return minNumberRadioStation;
    }

    public void setMinNumberRadioStation(int minNumberRadioStation) {

        this.minNumberRadioStation = minNumberRadioStation;
    }

}
