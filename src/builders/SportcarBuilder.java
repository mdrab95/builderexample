package builders;

import enums.CarType;
import model.Car;

/**
 * Created by Ace on 17.05.2018.
 */
public class SportcarBuilder extends CarBuilder {

    public void composeCar(){
        car = new Car();
        car.setHorsepowerNumber(500);
        car.setDistanceTravelled(40000);
        car.setAccidentFree(true);
        car.setCarType(CarType.SPORT);
        car.setCarPrice(200000);
    }

    public Car build(){
        composeCar();
        return car;
    }
}
