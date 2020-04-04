package chapter07;

import java.util.ArrayList;
import java.util.List;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {

        List<Character> list = new ArrayList<>();

        Thread thread0 = new StringReverseThread(list, "HELLO");
        Thread thread1 = new StringReverseThread(list, "WORLD");

        // it's random to start which thread first
        thread0.start();
        thread1.start();

//        thread0.join();
//        thread1.join();
    }
}
