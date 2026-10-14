package mutex;

import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Value {
    private int x;
    AtomicInteger atomicInteger;

    public synchronized void incValue(int i) {

            x += i;
    }

    public synchronized void decrValue(int i) {
            x -= i;
    }


    public int getValue() {
        return x;
    }
}
