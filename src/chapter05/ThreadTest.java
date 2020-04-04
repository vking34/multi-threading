package chapter05;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        CustomThread customThread = new CustomThread(30);
        Thread thread = new Thread(customThread);
        thread.start();

//        Thread.sleep(3_000);

        int sleep = 3000;
        int slept = 0;

        // if thread is completed within 3s then the program exits right after that
        while (slept < sleep){
            Thread.sleep(300);
            slept += 300;
            if (!thread.isAlive()){
                System.out.println("Thread was completed within 3s");
                System.exit(0);
            }
        }

        // if thread is not completed within 3s, then stop it safely
        if (thread.isAlive()){
            customThread.setShouldExit(true);
            thread.join();  // make it alive until the function reach the handler
        }

        System.exit(0);
    }
}
