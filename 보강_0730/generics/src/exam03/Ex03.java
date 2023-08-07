package exam03;

public class Ex03 {
    public static void main(String[] args) {
        FruitBox<Apple> fruitBox = new FruitBox<>(); // Apple, Fruit, Object
        //FruitBox<Fruit> fruitBox = new FruitBox<>();
        //FruitBox<Object> fruitBox = new FruitBox<>();

        Juicier.make3(fruitBox);
    }
}
