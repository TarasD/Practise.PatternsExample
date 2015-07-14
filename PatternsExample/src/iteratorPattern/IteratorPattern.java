package iteratorPattern;

/**
 * Created by taras on 14.07.15.
 */
public class IteratorPattern {
    public static void main(String[] args) {
        InformationArray informationArray = new InformationArray();

        for(Iterator iterator = informationArray.getIterator(); iterator.hasNext();){
            String information = (String) iterator.next();
            System.out.println("Information - " + information);
        }
    }
}
