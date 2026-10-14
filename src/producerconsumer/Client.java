package producerconsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        Store store = new Store();

        ExecutorService executorService =
                Executors.newCachedThreadPool();

        for(int i = 0; i < 10; i++) {
            Producer producer = new Producer(store);
            executorService.execute(producer);
        }


        for(int i = 0; i < 15; i++) {
            Consumer consumer = new Consumer(store);
            executorService.execute(consumer);
        }






    }
}
