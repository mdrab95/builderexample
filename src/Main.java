import builders.SedanBuilder;
import builders.SportcarBuilder;
import builders.SuvBuilder;
import director.CarDealership;
import model.Car;

public class Main {

    public static void main(String[] args) {

        CarDealership carDealership = new CarDealership(new SedanBuilder());
        Car firstCar = carDealership.getCar();

        carDealership.setCarBuilder(new SportcarBuilder());
        Car secondCar = carDealership.getCar();

        carDealership.setCarBuilder(new SuvBuilder());
        Car thirdCar = carDealership.getCar();

        System.out.println(firstCar.toString());
        System.out.println(secondCar.toString());
        System.out.println(thirdCar.toString());
    }
}
