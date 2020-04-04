package chapter07;

import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class StringReverseThread extends Thread {

    private List<Character> names;
    private String message;
    private static Lock LOCK = new ReentrantLock(true);

    StringReverseThread(List<Character> names, String message) {
        this.message = message;
        this.names = names;
    }

    void pleaseLock(){
        LOCK.lock();
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();

//        pleaseLock();
        LOCK.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " lock.");
            for (int i = 0; i < this.message.length(); i++) {
                this.names.add(this.message.charAt(i));
                Thread.sleep(50);
            }

            System.out.println(names);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName() + " unlock.");
            LOCK.unlock();
        }

        long timeTaken = System.currentTimeMillis() - startTime;
        System.out.println("Time taken of " + Thread.currentThread().getName() + ": " + timeTaken);
    }
}
