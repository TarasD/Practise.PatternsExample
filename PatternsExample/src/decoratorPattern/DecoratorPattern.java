package decoratorPattern;

/**
 * Created by taras on 14.07.15.
 */
public class DecoratorPattern {
    public static void main(String[] args) {
        Toast buttertoast = new ToastWithButter();

        Toast milkButtertoast = new MilkToastFiller(new ToastWithButter());

        Toast milkJemtoast = new MilkToastFiller(new ToastWithJem());

        System.out.println("Simple butter toast:");
        buttertoast.cook();

        System.out.println("\nButter toast with milk");
        milkButtertoast.cook();

        System.out.println("\nJem toast with milk");
        milkJemtoast.cook();
    }
}
