package exam03;

public class Ex02 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>(); // Fruit, Apple, Grape
        fruitBox.add(new Apple());
        fruitBox.add(new Apple());

        Juicier.make2(fruitBox);
    }
}
