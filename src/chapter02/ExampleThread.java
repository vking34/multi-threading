package chapter02;

public class ExampleThread extends Thread {

    public ExampleThread(String name){
        setName(name);
    }

    @Override
    public void run(){
        System.out.println("Starting thread: " + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++){
            System.out.println(super.getName() + ": " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Completing thread: " + Thread.currentThread().getName());
    }
}
