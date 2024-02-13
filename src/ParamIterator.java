import java.util.Iterator;

public class ParamIterator<T> implements Iterator<T> {

    private final ParamCollection<T> collection;

    private int index = 0;

    public ParamIterator(ParamCollection<T> collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        while (index < collection.getSize() && collection.getByIndex(index) == null) index++;
        return index < collection.getSize();
    }

    @Override
    public T next() {
        T item = collection.getByIndex(index);
        index++;
        return item;
    }
}
