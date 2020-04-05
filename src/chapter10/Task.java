package chapter10;

public class Task implements Runnable {

    private long createTime;
    private String taskName;

    Task(String taskName){
        this.taskName = taskName;
        this.createTime = System.currentTimeMillis();
    }

    @Override
    public void run() {

        String threadName = Thread.currentThread().getName();
        long waitedTime = System.currentTimeMillis() - this.createTime;
        System.out.println(this.taskName + " got CPU after waiting for " + waitedTime + "ms with thread " + threadName);

        try {
            Thread.sleep(3_000);
            System.out.println(this.taskName + " completed. Releasing thread " + threadName);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
