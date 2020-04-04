package chapter03;

public class ThreadTest {
    public static void main(String[] args){

        RunnableCalculator runnable = new RunnableCalculator(30000000000L);

        Thread t1 = new Thread(runnable);
        t1.setName("High Priority");
        t1.setPriority(Thread.MAX_PRIORITY);

        Thread t2 = new Thread(runnable);
        t2.setName("Normal Priority");
        t2.setPriority(Thread.NORM_PRIORITY);

        Thread t3 = new Thread(runnable);
        t3.setName("Min Priority");
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();


//        PriorityThread threadA = new PriorityThread(30000000000L);
//        threadA.setName("High Priority");
//        threadA.setPriority(Thread.MAX_PRIORITY);
//        threadA.start();
//
//        PriorityThread threadB = new PriorityThread(30000000000L);
//        threadB.setName("Normal Priority");
//        threadB.setPriority(Thread.NORM_PRIORITY);
//        threadB.start();
//
//        PriorityThread threadC = new PriorityThread(30000000000L);
//        threadC.setName("Min Priority");
//        threadC.setPriority(Thread.MIN_PRIORITY);
//        threadC.start();
    }
}
