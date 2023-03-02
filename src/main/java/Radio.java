public class Radio {
    public int maxStation = 9;
    public int minStation = 0;
    public int maxVolume = 100;
    public int minVolume = 0;
    public int currentRadioStation = minStation;
    public int currentVolume = minVolume;

    public Radio() {
    }
    public Radio (int amountStations) {

    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minStation) {
            return;
        }
        if (currentRadioStation > maxStation) {
            return;
        }

        this.currentRadioStation = currentRadioStation;
    }

    public void nextRadioStation() {

        if (currentRadioStation != maxStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = minStation;
        }


    }


    public void stepBackRadioStation() {

        if (currentRadioStation != minStation) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxStation;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;

    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

}
