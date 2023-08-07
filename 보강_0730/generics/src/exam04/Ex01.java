package exam04;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        Comparator<Fruit> comp = new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                return o1.getPrice() - o2.getPrice(); // 가격의 오름차순 정렬
            }
        };

        List<Apple> apples = Arrays.asList(
            new Apple("사과1", 10000),
            new Apple("사과3", 20000),
            new Apple("사과5", 5000),
            new Apple("사과3", 7000),
            new Apple("사과2", 25000)
        );

        Collections.sort(apples, comp); // Apple, Fruit, Object
        for (Apple apple : apples) {
            System.out.println(apple);
        }

        List<Grape> grapes = Arrays.asList(
                new Grape("포도1", 10000),
                new Grape("포도3", 20000),
                new Grape("포도5", 5000),
                new Grape("포도3", 7000),
                new Grape("포도2", 25000)
        );

        Collections.sort(grapes, comp); // ? super Grape : Grape, Fruit
        for (Grape grape : grapes) {
            System.out.println(grape);
        }
    }
}
