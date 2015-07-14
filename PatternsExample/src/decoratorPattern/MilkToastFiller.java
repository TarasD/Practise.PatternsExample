package decoratorPattern;

/**
 * Created by taras on 14.07.15.
 */
public class MilkToastFiller extends ToastFiller {
    public MilkToastFiller(Toast filledToast) {
        super(filledToast);
    }

    @Override
    public void cook() {
        filledToast.cook();
        setFiller(filledToast);
    }

    public void setFiller(Toast filledToast) {
        System.out.println("Toast filled with milk");
    }

}
