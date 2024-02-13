public class Calculator {

    public static <T extends Number, E extends Number> Double sum(T value1, E value2) {
        return value1.doubleValue() + value2.doubleValue();
    }

    public static <T extends Number, E extends Number> Double multiply(T value1, T value2) {
        return value1.doubleValue() * value2.doubleValue();
    }

    public static <T extends Number, E extends Number> Double divide(T value1, T value2) {
        if (value2.doubleValue() > value1.doubleValue()) return value2.doubleValue() / value1.doubleValue();
        else return value1.doubleValue() / value2.doubleValue();
    }

    public static <T extends Number, E extends Number> Double subtract(T value1, T value2) {
        if (value2.doubleValue() > value1.doubleValue()) return value2.doubleValue() - value1.doubleValue();
        else return value1.doubleValue() - value2.doubleValue();
    }
}
