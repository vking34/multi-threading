package chapter06;

import java.util.List;

public class StringReverseThread extends Thread {

    private List<Character> names;
    private String message;

    StringReverseThread(List<Character> names, String message) {
        this.message = message;
        this.names = names;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        try {
            synchronized (this.names) {
                for (int i = 0; i < this.message.length(); i++) {
                    this.names.add(this.message.charAt(i));
                    Thread.sleep(50);
                }

                System.out.println(names);
            }

            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long timeTaken = System.currentTimeMillis() - startTime;
        System.out.println("Time taken of " + Thread.currentThread().getName() + ": " + timeTaken);
    }
}
