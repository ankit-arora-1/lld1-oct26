package generics;

import java.util.List;

public class Pair<T extends Number,U extends Number> {
    T x;
    U y;

    public void setX(T val) {
        this.x = val;
    }

    public T getX() {
        return x;
    }

    public void setY(U val) {
        this.y = val;
    }

    public U getY() {
        return y;
    }

    public void printSum() {
       System.out.println(x.intValue() + y.intValue());
    }

    public static <P> P doSomething(P val1, P val2) {
        return null;
    }


}


