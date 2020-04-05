package chapter09;

public class DaemonThread {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
           while (true){
               System.out.println("Daemon Thread: " + Thread.currentThread().isDaemon());
               System.out.println(Thread.currentThread().getName() + " starts...");
               try {
                   Thread.sleep(2_000);
                   System.out.println("Daemon Thread is running...");
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        });

        thread.setName("Daemon Thread");
        thread.setDaemon(true);
        thread.start();

        System.out.println("Program is supposed to stop in 200ms.");
        Thread.sleep(200);
    }
}
