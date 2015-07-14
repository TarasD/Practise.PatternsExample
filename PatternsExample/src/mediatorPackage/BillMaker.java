package mediatorPackage;

import java.util.Date;

/**
 * Created by taras on 14.07.15.
 */
public class BillMaker {
    public static void printBill(Seller seller, String items) {
        System.out.println(new Date().toString() + " (" + seller.getNumber() + ". " + seller.getName() + ") " + items);
    }
}
