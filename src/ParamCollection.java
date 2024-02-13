import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ParamCollection<T> implements Iterable<T> {
    private T[] array;
    private int size;
    private int index = 0;

    public ParamCollection(T[] array) {
        this.array = array;
        this.size = array.length;
    }

    public int getSize() {
        return size;
    }

    public T getByIndex(int index) {
        return array[index];
    }

    public void addToArray(T element) {
        if (index < size) {
            array[index] = element;
            index++;
        } else throw new RuntimeException("Array is full!");
    }

    public void delFromArray(int index) {
        array[index] = null;
    }


    @Override
    public String toString() {
        return "ParamCollection{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public Iterator<T> iterator() {
        return new ParamIterator<>(this);
    }
}
