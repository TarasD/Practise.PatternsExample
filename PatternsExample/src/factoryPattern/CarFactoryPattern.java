package factoryPattern;

/**
 * Created by taras on 14.07.15.
 */
public class CarFactoryPattern {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        Car firstCar = carFactory.getCar("Sport");
        firstCar.drive();

        Car secondCar = carFactory.getCar("Travel");
        secondCar.drive();
    }

}
