package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Radio {
    private int numberOfStation;
    private int currentStation;
    private int currentVolume;

    public Radio(int numberOfStation) {
        this.numberOfStation = numberOfStation;
    }

    public Radio() {
        this.numberOfStation = 10;
    }

    public int getCurrentStation() {
        return this.currentStation;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        this.currentVolume = newCurrentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation >= 0) {
            if (currentStation <= 9) {
                this.currentStation = currentStation;
            }
        }
    }

    public void nextCurrentStation() {
        if (this.currentStation > 8) {
            this.currentStation = 0;
        } else {
            ++this.currentStation;
        }
    }

    public void prevCurrentStation() {
        if (this.currentStation < 1) {
            this.currentStation = 9;
        } else {
            --this.currentStation;
        }
    }

    public void upCurrentVolume() {
        if (this.currentVolume < 100) {
            ++this.currentVolume;
        } else {
            this.currentVolume = 100;
        }
    }

    public void downCurrentVolume() {
        if (this.currentVolume > 0) {
            --this.currentVolume;
        } else {
            this.currentVolume = 0;
        }
    }
}