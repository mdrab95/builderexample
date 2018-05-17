package builders;

import enums.CarType;
import model.Car;

/**
 * Created by Ace on 17.05.2018.
 */
public class SedanBuilder extends CarBuilder{
    public void composeCar(){
        car = new Car();
        car.setHorsepowerNumber(150);
        car.setDistanceTravelled(220000);
        car.setAccidentFree(true);
        car.setCarType(CarType.SEDAN);
        car.setCarPrice(25000);
    }

    public Car build(){
        composeCar();
        return car;
    }
}