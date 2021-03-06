package ru.netology;

public class Radio {
    private int currentStation;

    private int currentVolume;

    public int getCurrentStation() {

        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        currentVolume = newCurrentVolume;
    }

    public void setCurrentStation(int currentStation) {

        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextCurrentStation() {

        if (currentStation > 8) {
            currentStation = 0;
            return;
        }
        this.currentStation = currentStation + 1;
    }

    public void prevCurrentStation() {

        if (currentStation < 1) {
            currentStation = 9;
            return;
        }
        this.currentStation = currentStation - 1;
    }

    public void upCurrentVolume() {

        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
            return;
        }

        this.currentVolume = 10;
    }

    public void downCurrentVolume() {

        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
            return;
        }
        this.currentVolume = 0;
    }

}
