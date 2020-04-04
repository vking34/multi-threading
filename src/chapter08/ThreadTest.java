package chapter08;

public class ThreadTest {
    public static void main(String[] args){

        Producer producer = new Producer();
        producer.setName("producer");
        producer.start();

        Consumer consumer0 = new Consumer(producer);
        consumer0.setName("consumer0");
        consumer0.start();

        Consumer consumer1 = new Consumer(producer);
        consumer1.setName("consumer1");
        consumer1.start();

        Consumer consumer2 = new Consumer(producer);
        consumer2.setName("consumer2");
        consumer2.start();
    }
}
