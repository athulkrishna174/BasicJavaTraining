
class Counter {
    int count = 0;

    public synchronized void increment() {
        count++;
    }
}

public class SynchronizedThread {
    public static void main(String[] args) throws Exception {
        final int n = 1000;

        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < n; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < n; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count = " + counter.count);
    }

}
