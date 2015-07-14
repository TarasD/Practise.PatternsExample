package adapterPattern;

/**
 * Created by taras on 14.07.15.
 */
public class HexScrewer implements BetterScrewer {
    @Override
    public void screwCross() {

    }

    @Override
    public void screwHex() {
        System.out.println("Screwing hex bolt");
    }
}
