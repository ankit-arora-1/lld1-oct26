package producerconsumer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private int maxSize;
    List<Object> list;

    public Store() {
        this.maxSize = 6;
        list = new ArrayList<>(this.maxSize);
    }

    public void createShirt() {
        if(list.size() < maxSize) {
            list.add(new Object());
            System.out.println("Employee has created a shirt");
        }
    }

    public void removeShirt() {
        if(list.size() > 0) {
            list.remove( list.size() - 1);
            System.out.println("Customer has taken a shirt");
        }
    }
}
