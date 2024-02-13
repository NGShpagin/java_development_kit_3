import java.util.Iterator;

public class Club<T extends Person> implements Iterable<T> {
    private T[] clubbers;

    public Club(T[] clubbers) {
        this.clubbers = clubbers;
    }

    public void danceEverybody() {
        for (T clubber: clubbers) {
            clubber.haveRest();
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new PersonIterator();
    }

    class PersonIterator implements Iterator<T> {

        private int index = 0;

//        public ParamIterator(ParamCollection<T> collection) {
//            this.collection = clubbers;
//        }

        @Override
        public boolean hasNext() {
            return index < clubbers.length;
        }

        @Override
        public T next() {
            T item = clubbers[index];
            index++;
            return item;
        }
    }
}
