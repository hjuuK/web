package exam04;

public class Apple extends Fruit<Apple> /*implements Comparable<Apple>*/ {
    private String name;
    private int price;

    public Apple(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Apple o) {
        return name.compareTo(o.name);
    }

    public int getPrice() {
        return price;
    }
}
