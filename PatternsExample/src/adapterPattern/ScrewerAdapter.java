package adapterPattern;

/**
 * Created by taras on 14.07.15.
 */
public class ScrewerAdapter implements Screwer {
    BetterScrewer betterScrewer;

    public ScrewerAdapter(String type) {
        if(type.equals("cross")) {
            betterScrewer = new CrossScrewer();
        }
        else if(type.equals("hex")) {
            betterScrewer = new HexScrewer();
        }
    }

    @Override
    public void screw(String type){
        if(type.equals("cross")) {
            betterScrewer.screwCross();
        }
        else if(type.equals("hex")) {
            betterScrewer.screwHex();
        }
    }

}
