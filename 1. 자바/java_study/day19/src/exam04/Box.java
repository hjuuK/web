package exam04;

public class Box<T extends Fruit> { // Fruit, Apple, Melon

    //private static T item2; // static 사용 X

    /*
    public static void method(T t){  // static 메서드 사용 X

    }

    private T[] items = new T[]; // 배열 사용 X
     */

    private T item; // T - Fruit

    public void put(T item) { // T - Fruit
        this.item = item;
    }

    public T get() { // T - Fruit
        return item;
    }

    public void showInfo() {
        item.showInfo();
    }
}
