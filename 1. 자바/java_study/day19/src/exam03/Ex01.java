package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<Apple>();
        appleBox.put(new Apple());

        Apple apple = appleBox.get();
        apple.showInfo();

        Box<Melon> melonBox = new Box<Melon>();
        melonBox.put(new Melon());

        melonBox.showInfo();
    }
}
