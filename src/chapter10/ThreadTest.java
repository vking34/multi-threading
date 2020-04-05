package chapter10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest {
    public static void main(String[] args){

        ThreadTest threadTest = new ThreadTest();
        threadTest.startThreadPool();
    }

    private void startThreadPool(){
        // create Thread Pool

        // with single thread in pool:
//        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // with new threads as needed
        // but will reuse previously constructed threads when they are available:
//        ExecutorService executorService = Executors.newCachedThreadPool();

        // with new threads as needed but the number of threads =< given value:
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        Task task0 = new Task("Task-0");
        Task task1 = new Task("Task-1");
        Task task2 = new Task("Task-2");
        Task task3 = new Task("Task-3");
        Task task4 = new Task("Task-4");
        Task task5 = new Task("Task-5");

        executorService.submit(task0);
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);
        executorService.submit(task4);
        executorService.submit(task5);

        // Thread Pool will shutdown when all previously submitted tasks are executed
        executorService.shutdown();
    }
}
