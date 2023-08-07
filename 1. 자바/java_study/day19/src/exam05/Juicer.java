package exam05;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Juicer<T> {

    private T item;

    public static void make(FruitBox<? extends Fruit> fruitBox) {
        ArrayList<?> items = fruitBox.get();
        System.out.println(items);
    }

    public static <T extends Fruit> void make2(FruitBox<T> fruitBox) {
        ArrayList<T> items = fruitBox.get();
        System.out.println(items);
    }

    /*
    public static void make(FruitBox<? super Apple> fruitBox) { // ? - Apple, Fruit, Object
        ArrayList<?> items = fruitBox.get();
        System.out.println(items);
    }
     */
}
