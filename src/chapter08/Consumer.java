package chapter08;

public class Consumer extends Thread {

    private Producer producer;

    public Consumer(Producer producer){
        this.producer = producer;
    }

    @Override
    public void run() {
        try {
            while (true){
                String data = producer.consume();
                System.out.println(Thread.currentThread().getName() + " consume data: " + data);
                Thread.sleep(200);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
