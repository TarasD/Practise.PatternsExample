package iteratorPattern;

/**
 * Created by taras on 14.07.15.
 */
public class InformationArray implements Container{
    public String[] information = {"Some staff", "Text", "Money", "Traveling", "Job"};

    @Override
    public Iterator getIterator() {
        return new InformationIterator();
    }

    private class InformationIterator implements Iterator {
        private int index;

        @Override
        public boolean hasNext() {
            if(index < information.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()) {
                return information[index++];
            }
            return null;
        }
    }
}
