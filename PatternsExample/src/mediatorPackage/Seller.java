package mediatorPackage;

/**
 * Created by taras on 14.07.15.
 *
 */
public class Seller {
    private int number;
    private String name;

    public Seller(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber() {
        this.number = number;
    }

    public void printBill(String items) {
        BillMaker.printBill(this, items);
    }
}
