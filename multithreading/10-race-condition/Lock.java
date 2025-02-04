import java.util.concurrent.atomic.AtomicInteger;

public class Lock {
     public static int count = 0;
     public static Object lock=new Object();
   // public static  AtomicInteger count = new AtomicInteger(0);
    public static void increment() {
        count++;
        synchronized(lock){
        
    }
}

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) throws InterruptedException {

        Runnable incrementTask = () -> {
            for (int i = 0; i < 1000; i++) {
                increment();
            }
        };

        Thread t1 = new Thread(incrementTask);
        Thread t2 = new Thread(incrementTask);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count (might be incorrect): " + getCount());
    }
}
