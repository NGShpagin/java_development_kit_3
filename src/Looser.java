public class Looser implements Person {
    @Override
    public void doWork() {
        System.out.print("I don`t want to work so... ");
        haveRest();
    }

    @Override
    public void haveRest() {
        System.out.println("Party hard");
    }
}
