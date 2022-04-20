package ru.netology;

public class Radio {
    private int currentStation;

    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
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

    public int getNextCurrentStation(int currentStation) {

        if (currentStation > 8) {
            return 0;
        }
        return (currentStation + 1);
    }

    public int getPrevCurrentStation(int currentStation) {

        if (currentStation < 1) {
            return 0;
        }
        return (currentStation - 1);
    }


    public int getUpCurrentVolume(int currentVolume) {

        if (currentVolume < 10) {
            return (currentVolume + 1);
        }

        return currentVolume;
    }

    public int getDownCurrentVolume(int currentVolume) {

        if (currentVolume > 0) {
            return (currentVolume - 1);
        }
        return currentVolume;
    }
}
