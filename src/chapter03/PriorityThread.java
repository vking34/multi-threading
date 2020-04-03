package chapter03;

public class PriorityThread extends Thread {

    private long value;

    PriorityThread(long value){
        this.value = value;
    }

    @Override
    public void run(){

        long startTime = System.currentTimeMillis();
        long sum = 0;
        for (long i = 0; i < this.value; i++){
            sum += i;
        }

        long timeTaken = System.currentTimeMillis() - startTime;
        System.out.println("Elapsed time: " + timeTaken + " for thread: " + Thread.currentThread().getName());
    }
}
