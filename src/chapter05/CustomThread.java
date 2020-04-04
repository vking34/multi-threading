package chapter05;

public class CustomThread implements Runnable {

    private long value;
    private Boolean shouldExit = false;

    CustomThread(long value){
        this.value = value;
    }

    void setShouldExit(Boolean shouldExit){
        this.shouldExit = shouldExit;
    }

    @Override
    public void run() {
        try {
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < this.value; i++) {
                // handler
                if (shouldExit){
                    break;
                }

                // process
                System.out.println("Thread is running...");
                Thread.sleep(200);
            }

            long timeTaken = System.currentTimeMillis() - startTime;
            System.out.println("Thread is completed in " + timeTaken);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
