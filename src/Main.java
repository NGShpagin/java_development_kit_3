
/*
    Задание 1.
    Создать обобщенный класс с тремя параметрами (T, V, K).
    Класс три переменные типа (T, V, K), конструктор, принимающий на вход параметры типа (T, V, K),
    методы, возвращающие значения трех переменных.
    Создать метод, выводящий в консоль имена классов для трех переменных класса.
    Наложить ограничения на параметры типа:
    T должен реализовать интерфейс Comparable (классы оболочки, String),
    V должен реализовать интерфейс DataInput и расширять класс InputStream,
    K должен расширять класс Number.
 */

/*
    Задание 2.
    Описать собственную коллекцию - список на основе массива.
    Коллекция должна иметь возможность хранить любые типы данных, иметь методы добавления и удаления элементов.
 */

/*
    Задание 3.
    Написать итератор по массиву.
    Итератор - это объект
 */

/*
    Задание 4.
    Описать интерфейс Person с методами doWork() и haveRest().
    Написать два класса - работник и бездельник, реализующих интерфейс.
    Работник работает и не умеет бездельничать в то время, как бездельник не умеет работать, но умеет отдыхать.
    Написать обобщенные классы Workplace и Club, содержащие массив из Person.
    В классах необходимо вызывать у всего массива людей соответствующие методы.
 */

/*
    Задание 5.
    Внедрить итератор из задания 2 в коллекцию, написанную в задании 3 таким образом,
    чтобы итератор был внутренним классом и, соответственно, объектом в коллекции
 */

/*
    Задание 6.
    Написать класс калькулятор (необобщенный), который содержит обобщенные статические методы:
    sum(), multiply(), divide(), subtract().
    Параметры этих методов - два числа разного типа, над которыми должна быть произведена операция
 */

/*
    Задача 7.
    Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые,
    и false в противном случае.
    Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа.
 */

/*
    Задание 8.
    Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
    Класс должен иметь методы getFirst(), getSecond() для получения значений пары,
    а также переопределение метода toString, возвращающее строковое представление пары.
 */

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        // Задание 1
        System.out.println("Задание 1");
        MyClass<String, DataInputStream, Number> myClass
                = new MyClass<>("string", new DataInputStream(new FileInputStream("src/test.txt")), 123);
        myClass.showType();

        // Задание 2
        System.out.println("Задание 2");
        ParamCollection<Integer> paramCollection = new ParamCollection<>(new Integer[5]);
        paramCollection.addToArray(5);
        paramCollection.addToArray(3);
        paramCollection.addToArray(1);
        paramCollection.addToArray(0);
        paramCollection.addToArray(8);
        System.out.println(paramCollection);
        paramCollection.delFromArray(1);
        paramCollection.delFromArray(2);
        System.out.println(paramCollection);

        // Задание 3
        System.out.println("Задание 3");
        for (int item : paramCollection) {
            System.out.print(item + " ");
        }
        System.out.println();

        // Задание 4
        System.out.println("Задание 4");
        Person person1 = new Worker();
        Person person2 = new Worker();
        Person person3 = new Worker();
        Person person4 = new Looser();
        Person person5 = new Looser();
        Person person6 = new Looser();

        Workplace<? extends Person> workplace = new Workplace<>(new Person[]{person1, person2, person3, person4, person5, person6});
        workplace.workEverybody();

        Club<? extends Person> nightClub = new Club<>(new Person[]{person1, person2, person3, person4, person5, person6});
        nightClub.danceEverybody();

        // Задание 5
        for (Person clubber: nightClub) {
            System.out.println(clubber);
        }

        // Задание 6
        System.out.println(Calculator.sum(123L, 23.00));
        System.out.println(Calculator.divide(123, 56.00));
        System.out.println(Calculator.multiply(123f, 76));
        System.out.println(Calculator.subtract(12, 23.00));

        // Задание 7
        String[] array1 = {"asd", "dsg", "fsdf"};
        String[] array2 = {"asd", "dsg"};
        System.out.println(compareArrays(array1, array2));
        Integer[] array3 = {1, 2, 3};
        Integer[] array4 = {1, 2, 3};
        System.out.println(compareArrays(array3, array4));

        // Задание 8
        Pair pair = new Pair<>("Hello", "243");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);

    }

    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            System.out.printf("""
                    Размер массивов должен быть одинаковым.
                    Размер 1-ого массива: %d
                    Размер 2-ого массива: %d
                    """, array1.length, array2.length);
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) return false;
        }
        return true;
    }
}

