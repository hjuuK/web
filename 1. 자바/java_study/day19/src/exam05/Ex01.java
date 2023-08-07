package exam05;

public class Ex01 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        Juicer.make(appleBox);

        FruitBox<Fruit> melonBox = new FruitBox<>();
        melonBox.add(new Melon());
        melonBox.add(new Melon());
        melonBox.add(new Melon());

        Juicer.make2(melonBox);


        /*
        FruitBox<Toy> toyBox = new FruitBox<>();
        toyBox.add(new Toy());

        Juicer.make(toyBox);
         */
    }
}
