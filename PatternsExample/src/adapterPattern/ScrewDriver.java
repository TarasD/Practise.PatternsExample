package adapterPattern;

/**
 * Created by taras on 14.07.15.
 */
public class ScrewDriver implements Screwer {
    ScrewerAdapter screwerAdapter;

    @Override
    public void screw(String type) {
        if(type.equals("flat")) { //standart bolt type
            System.out.println("Screwing flat bolt");
        }

        else if(type.equals("cross") || type.equals("hex")) { //needed adapter to screw this type
            screwerAdapter = new ScrewerAdapter(type);
            screwerAdapter.screw(type);
        }

        else {
            System.out.println("Wrong bolt type");
        }
    }
}
