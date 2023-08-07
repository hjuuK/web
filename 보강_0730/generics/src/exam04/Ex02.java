package exam04;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        Comparator<Fruit> comp = new Comparator<Fruit>() { // ? super T // T, T의 상위 클래스
            @Override
            public int compare(Fruit o1, Fruit o2) {
                return o1.getPrice() - o2.getPrice();
            }
        };

        List<Apple> apples = Arrays.asList(     // super이기 때문에 Apple로 써도 Fruit도 적용
                new Apple("사과1", 10000),
                new Apple("사과3", 20000),
                new Apple("사과5", 5000),
                new Apple("사과3", 7000),
                new Apple("사과2", 25000)
        );

        Collections.sort(apples, comp);
        for (Apple apple : apples) {
            System.out.println(apple);
        }

        System.out.println("----------------------------------------");

        List<Grape> grapes = Arrays.asList(     // super이기 때문에 Grape로 써도 Fruit도 적용
                new Grape("포도1", 10000),
                new Grape("포도3", 20000),
                new Grape("포도5", 5000),
                new Grape("포도3", 7000),
                new Grape("포도2", 25000)
        );

        Collections.sort(grapes, comp);
        for (Grape grape : grapes) {
            System.out.println(grape);
        } // sort // sort(List<T> list, Comparator<? super T> c)
    }
}
