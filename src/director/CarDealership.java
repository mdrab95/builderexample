package director;

import builders.CarBuilder;
import model.Car;

/**
 * Created by Ace on 17.05.2018.
 */
public class CarDealership {

    private CarBuilder carBuilder;

    public CarDealership(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }

    public void setCarBuilder(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }

    public Car getCar(){
        return carBuilder.build();
    }
}
