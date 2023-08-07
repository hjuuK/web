package exam04;

import java.util.Comparator;

public abstract class Fruit<T> implements Comparable<T> {
   // public abstract int compareTo(T o);
    public abstract int getPrice();
}
