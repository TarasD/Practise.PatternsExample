package decoratorPattern;

/**
 * Created by taras on 14.07.15.
 */
public class ToastWithButter implements Toast{
    @Override
    public void cook() {
        System.out.println("Cook Toast with butter");
    }
}
