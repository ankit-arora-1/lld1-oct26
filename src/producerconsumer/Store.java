package producerconsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Store {
    private int maxSize;
    private List<Object> list;

    private Lock lock;

    public Store() {
        this.maxSize = 6;
        list = new ArrayList<>(this.maxSize);
        lock = new ReentrantLock();
    }

    public void createShirt() {
            lock.lock();
            list.add(new Object());
            System.out.println("Employee has created a shirt. Size: " + list.size());
            lock.unlock();
    }

    public void removeShirt() {
            lock.lock();
            list.remove( list.size() - 1);
            System.out.println("Customer has taken a shirt. Size: " + list.size());
            lock.unlock();
    }
}
