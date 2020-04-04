package chapter06;

import java.util.ArrayList;
import java.util.List;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {

        List<Character> list = new ArrayList<>();

        Thread thread0 = new StringReverseThread(list, "HELLO");
        thread0.start();

        Thread thread1 = new StringReverseThread(list, "WORLD");
        thread1.start();

//        thread0.join();
//        thread1.join();
    }
}
