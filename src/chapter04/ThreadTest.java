package chapter04;

import chapter03.RunnableCalculator;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {

        RunnableCalculator runnable = new RunnableCalculator(30000000000L);
        Thread thread = new Thread(runnable);
        thread.setName("High Priority");
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();

        while (thread.isAlive()){
            System.out.println("Thread " + thread.getName() + " is active...");
            Thread.sleep(500);
        }

        System.out.println("Thread " + thread.getName() + " is completed!");
    }
}
