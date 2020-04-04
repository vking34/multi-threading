package chapter06;

import java.util.List;

public class StringReverseThread extends Thread {

    private List<Character> names;
    private String message;

    StringReverseThread(List<Character> names, String message){
        this.message = message;
        this.names = names;
    }

    @Override
    public void run(){
        synchronized (this.names) {
            try {
                for (int i = 0; i < this.message.length(); i++) {
                    this.names.add(this.message.charAt(i));
                    Thread.sleep(50);
                }
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }

            System.out.println(names);
        }
    }
}
