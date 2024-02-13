import java.io.DataInput;
import java.io.FileInputStream;
import java.io.InputStream;

public class MyClass<T extends Comparable<String>, V extends InputStream & DataInput, K extends Number> {
    T type;
    V value;
    K key;

    public MyClass(T type, V value, K key) {
        this.type = type;
        this.value = value;
        this.key = key;
    }

    public T getType() {
        return type;
    }

    public V getValue() {
        return value;
    }

    public K getKey() {
        return key;
    }

    public void showType() {
        System.out.printf("Type of type is %s, type = %s\n"
                        + "Type of value is %s, value = %s\n"
                        + "Type of key is %s, key = %s\n",
                type.getClass().getName(), getType(),
                value.getClass().getName(), getValue(),
                key.getClass().getName(), getKey());
    }
}
