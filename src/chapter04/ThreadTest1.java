package chapter04;

import chapter03.RunnableCalculator;

public class ThreadTest1 {
    public static void main(String[] args) throws InterruptedException {

        RunnableCalculator runnable = new RunnableCalculator(30000000000L);
        Thread thread = new Thread(runnable);
        thread.setName("High Priority");
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();

        thread.join();
//        thread.join(3_000);
//        System.out.println("Completed thread join.");
        System.exit(0);
    }
}
