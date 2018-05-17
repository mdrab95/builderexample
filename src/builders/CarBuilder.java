package builders;

import model.Car;

/**
 * Created by Ace on 17.05.2018.
 */
public abstract class CarBuilder {

    protected Car car;

    protected abstract void composeCar();

    public Car build(){
        return car;
    }
}
