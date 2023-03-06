public class Radio {

    private int currentRadioStation;
    private int currentVolume;
    private int maxStation;

    public Radio() {
        maxStation = 9;
    }

    public Radio(int amountStation) {
        maxStation = amountStation - 1;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
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
            currentRadioStation = 0;
        }


    }


    public void stepBackRadioStation() {

        if (currentRadioStation != 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxStation;
        }
    }

    public void setVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;

    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

}
