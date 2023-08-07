package exam03;

public class Box<T extends Fruit> { // T - Fruit, Apple, Melon // 클래스 제한
    private T item; // T - Fruit

    public void put(T item) { // Fruit
        this.item = item;
    } // T - Fruit

    public T get() { // T - Fruit
        return item;
    }

    public void showInfo() {
        item.showInfo();
    }
}
