package builders;

import enums.CarType;
import model.Car;

/**
 * Created by Ace on 17.05.2018.
 */
public class SuvBuilder extends CarBuilder {

    public void composeCar(){
        car = new Car();
        car.setHorsepowerNumber(250);
        car.setDistanceTravelled(120000);
        car.setAccidentFree(true);
        car.setCarType(CarType.SUV);
        car.setCarPrice(35000);
    }

    public Car build(){
        composeCar();
        return car;
    }
}
