package decoratorPattern;

/**
 * Created by taras on 14.07.15.
 */
public abstract class ToastFiller implements Toast {
    protected Toast filledToast;

    public ToastFiller(Toast filledToast) {
        this.filledToast = filledToast;
    }

    public void cook() {
        filledToast.cook();
    }
}
