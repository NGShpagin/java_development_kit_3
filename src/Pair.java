public class Pair<T, E> {
    private T parameter1;
    private E parameter2;

    public Pair(T parameter1, E parameter2) {
        this.parameter1 = parameter1;
        this.parameter2 = parameter2;
    }

    public T getFirst() {
        return parameter1;
    }

    public E getSecond() {
        return parameter2;
    }

    @Override
    public String toString() {
        return "Parameter 1: " + parameter1 + "\n"
                + "Parameter 2: " + parameter2;
    }
}
