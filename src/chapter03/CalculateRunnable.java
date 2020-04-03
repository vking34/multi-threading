package chapter03;

public class CalculateRunnable implements Runnable {

    private long value;

    public CalculateRunnable(long value){
        this.value = value;
    }

    @Override
    public void run() {

        long startTime = System.currentTimeMillis();
        long sum = 0;
        for (long i = 0; i < this.value; i++){
            sum += i;
        }

        long timeTaken = System.currentTimeMillis() - startTime;
        System.out.println("Elapsed time: " + timeTaken + " for thread: " + Thread.currentThread().getName());
    }
}
