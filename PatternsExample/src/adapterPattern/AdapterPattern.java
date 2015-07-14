package adapterPattern;

/**
 * Created by taras on 14.07.15.
 */
public class AdapterPattern {
    public static void main(String[] args) {
        ScrewDriver screwDriver = new ScrewDriver();

        screwDriver.screw("flat");
        screwDriver.screw("cross");
        screwDriver.screw("hex");
        screwDriver.screw("twelve-head");
    }
}
