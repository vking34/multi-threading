package chapter02;

public class SimpleThread {
    public static void main(String[] args){

        ExampleThread thread = new ExampleThread("A");
        ExampleThread thread1 = new ExampleThread("B");

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
