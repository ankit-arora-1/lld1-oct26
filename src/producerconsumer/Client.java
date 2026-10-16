package producerconsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Store store = new Store();
        Semaphore producerSemaphore = new Semaphore(6);
        Semaphore consumerSemephore = new Semaphore(0);

        ExecutorService executorService =
                Executors.newCachedThreadPool();

        for(int i = 0; i < 10; i++) {
            Producer producer = new Producer(store, producerSemaphore, consumerSemephore);
            executorService.execute(producer);
        }


        for(int i = 0; i < 15; i++) {
            Consumer consumer = new Consumer(store, producerSemaphore, consumerSemephore);
            executorService.execute(consumer);
        }






    }
}
