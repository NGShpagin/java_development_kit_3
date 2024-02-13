public class Worker implements Person {
    @Override
    public void doWork() {
        System.out.println("Working hard");
    }

    @Override
    public void haveRest() {
        System.out.print("I don`t know how to rest so... ");
        doWork();
    }
}
