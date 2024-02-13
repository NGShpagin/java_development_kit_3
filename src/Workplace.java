public class Workplace<T extends Person> {

    private T[] workers;

    public Workplace(T[] workers) {
        this.workers = workers;
    }

    public void workEverybody() {
        for (T worker: workers) {
            worker.doWork();
        }
    }
}
