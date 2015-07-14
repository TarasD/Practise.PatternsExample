package decoratorPattern;

/**
 * Created by taras on 14.07.15.
 */
public class ToastWithJem implements Toast {
    @Override
    public void cook() {
        System.out.println("Cook Toast with jem");
    }
}
