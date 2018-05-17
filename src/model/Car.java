package model;

import enums.CarType;

/**
 * Created by Ace on 17.05.2018.
 */
public class Car {

    private int horsepowerNumber;

    private int distanceTravelled;

    private boolean accidentFree;

    private CarType carType;

    private int carPrice;

    public int getHorsepowerNumber() {
        return horsepowerNumber;
    }

    public void setHorsepowerNumber(int horsepowerNumber) {
        this.horsepowerNumber = horsepowerNumber;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(int distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    public boolean isAccidentFree() {
        return accidentFree;
    }

    public void setAccidentFree(boolean accidentFree) {
        this.accidentFree = accidentFree;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    @Override
    public String toString() {
        return "Car{" +
                "horsepowerNumber=" + horsepowerNumber +
                ", distanceTravelled=" + distanceTravelled +
                ", accidentFree=" + accidentFree +
                ", carType=" + carType +
                ", carPrice=" + carPrice +
                '}';
    }
}