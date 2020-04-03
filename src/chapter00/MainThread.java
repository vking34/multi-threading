package chapter00;

public class MainThread {

    public static void main(String[] args) throws InterruptedException {

        Thread t = Thread.currentThread();
        System.out.println("Current Thread: " + t.getName());

        Thread.sleep(3_000);

        t.setName("my-thread");
        System.out.println("Current Thread: " + t.getName());
    }
}
