package exam04;

import java.util.Comparator;

public class Grape extends Fruit<Grape> /*implements Comparable<Grape>*/ {
    private String name;
    private int price;

    public Grape(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Grape{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Grape o) {
        return name.compareTo(o.name);
    }

    public int getPrice() {
        return price;
    }
}
