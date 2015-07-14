package factoryPattern;

/**
 * Created by taras on 14.07.15.
 */
public class CarFactory {
    public Car getCar(String type) {
        if(type == "Sport") {
            return new SportCar();
        }
        else if(type == "Travel") {
            return new TravelCar();
        }
        return null;
    }
}
