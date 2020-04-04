package chapter08;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Producer extends Thread {

    private final static int MAX_SIZE = 3;
    private final List<String> messages = new ArrayList<>();

    @Override
    public void run() {
        try {
            while (true){
                producer();
            }
        }
         catch (Exception e){
            e.printStackTrace();
         }
    }

    private synchronized void producer() throws Exception {
        while (messages.size() == MAX_SIZE){
            System.out.println("Queue is full!!!");
            wait();
            System.out.println("Queue is ready...");
        }

        String timeString = LocalDateTime.now().toString();
        messages.add(timeString);
        System.out.println("Producer produces data: " + timeString);
        notify(); // notify consumers that some data is currently created.
    }

    synchronized String consume() throws Exception {
        notify(); // notify that a consumer is gonna take data from the queue (list)
        while (messages.isEmpty()){
            wait();
        }

        String data = messages.get(0);
        messages.remove(0);
        return data;
    }
}
