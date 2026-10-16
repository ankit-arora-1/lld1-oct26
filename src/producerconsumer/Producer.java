package producerconsumer;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Store store;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    public Producer(Store store, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
        this.store = store;
    }

    @Override
    public void run() {
        while(true) {
            try {
                producerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Some heavy processing here. Make an api call");
            store.createShirt();
            consumerSemaphore.release();
        }
    }
}
