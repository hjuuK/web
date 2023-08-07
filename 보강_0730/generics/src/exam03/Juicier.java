package exam03;

import java.util.List;

public class Juicier {
    public static void make(FruitBox<?> fruitBox) {
        List<?> items = fruitBox.gets();
        System.out.println(items);
    }

    public static void make2(FruitBox<? extends Fruit> fruitBox) { // Fruit, Apple, Grape
        List<?> items = fruitBox.gets();
        System.out.println(items);
    }

    public static <T extends Fruit> void make4(FruitBox<T> fruitBox) {
        List<T> items = fruitBox.gets();
        System.out.println(items);
    }

    public static void make3(FruitBox<? super Apple> fruitBox) { // Apple, Fruit, Object // Apple을 포함한 상위 클래스
        List<?> items = fruitBox.gets();
        System.out.println(items);
    }

//    public static void make(FruitBox<Grape> grapeBox) { // 메서드 중복 정의
//        List<Grape> items = grapeBox.gets();
//        System.out.println(items);
//    }
}
