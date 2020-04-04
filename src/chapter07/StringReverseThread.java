package chapter07;

import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class StringReverseThread extends Thread {

    private List<Character> names;
    private String message;
    private static Lock LOCK = new ReentrantLock();

    StringReverseThread(List<Character> names, String message) {
        this.message = message;
        this.names = names;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        LOCK.lock();
        try {
            synchronized (this.names) {
                System.out.println(Thread.currentThread().getName() + " acquires Names List");
                for (int i = 0; i < this.message.length(); i++) {
                    this.names.add(this.message.charAt(i));
                    Thread.sleep(50);
                }

                System.out.println(names);
                System.out.println(Thread.currentThread().getName() + " releases Names List");
            }

            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            LOCK.unlock();
        }

        long timeTaken = System.currentTimeMillis() - startTime;
        System.out.println("Time taken of " + Thread.currentThread().getName() + ": " + timeTaken);
    }
}
