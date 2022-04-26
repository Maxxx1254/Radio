package ru.netology;

public class Radio {
    private int currentStation;

    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }
    public void setCurrentStation(int newCurrentStation) {
        currentStation = newCurrentStation;
    }
    public void setCurrentVolume( int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void setCurrentStation() {

        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getNextCurrentStation() {

        if (currentStation > 8) {
            return 0;
        }
        return (currentStation + 1);
    }

    public int getPrevCurrentStation() {

        if (currentStation < 1) {
            return 9;
        }
        return (currentStation - 1);
    }


    public int getUpCurrentVolume() {

        if (currentVolume < 10) {
            return (currentVolume + 1);
        }

        return currentVolume;
    }

    public int getDownCurrentVolume() {

        if (currentVolume > 0) {
            return (currentVolume - 1);
        }
        return currentVolume;
    }

}
