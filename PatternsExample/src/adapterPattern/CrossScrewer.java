package adapterPattern;

/**
 * Created by taras on 14.07.15.
 */
public class CrossScrewer implements BetterScrewer {
    @Override
    public void screwCross() {
        System.out.println("Screwing cross bolt");
    }

    @Override
    public void screwHex() {

    }
}
