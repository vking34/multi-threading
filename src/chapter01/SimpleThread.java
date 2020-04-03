package chapter01;

public class SimpleThread {
    public static void main(String[] args){

        ExampleThread exampleThread = new ExampleThread("A");
        Thread thread = new Thread(exampleThread);
        thread.setName("A");

        ExampleThread exampleThread1 = new ExampleThread("B");
        Thread thread1 = new Thread(exampleThread1);
        thread1.setName("B");

        thread.start();
        thread1.start();

        // in the main thread
//        for (int i = 0; i < 10; i++){
//            System.out.println("Main: " + i);
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

    }
}
