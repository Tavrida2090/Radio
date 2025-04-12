package ru.netology;

public class Radio {
    private int currentStation; // текущая станция
    private int currentVolume; // текущая громкость
    private int maxStation;

    public Radio() {
        this.maxStation = 9;

    }

    public Radio(int stationsCount) {
        this.maxStation = stationsCount - 1;

    }

    public void next() {                //переключаем на следующую станцию
        if (currentStation != maxStation) {
            currentStation++;
            return;
        }
        currentStation = 0;
    }

    public void prev() {                //переключаем на предыдущую станцию
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {           //текущая станция не может быть меньше нуля
            return;
        }
        if (currentStation > maxStation) {           //текущая станция не может быть больше выбранной за максимальную
            return;
        }
        this.currentStation = currentStation;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {              //прибавляем громкость, если она меньше максимума 100
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {                //убавляем громкость, если она имеет положительное значение
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {                //грмоксоть не может быть ниже нуля
            return;
        }
        if (currentVolume > 100) {              //громксоть не может превышать 100
            return;
        }
        this.currentVolume = currentVolume;
    }
}
