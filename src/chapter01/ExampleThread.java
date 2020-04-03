package chapter01;

public class ExampleThread implements Runnable {

    private String name;

    ExampleThread(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Starting thread: " + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++){
            System.out.println(this.name + ": " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Completing thread: " + Thread.currentThread().getName());
    }
}
