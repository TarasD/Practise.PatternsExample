package mediatorPackage;

/**
 * Created by taras on 14.07.15.
 */
public class MediatorPattern {
    public static void main(String[] args) {
        Seller kate = new Seller("Kate", 1);
        Seller markus = new Seller("Markus", 2);

        kate.printBill("Bread, milk");
        markus.printBill("Bear, crisps");
    }
}
