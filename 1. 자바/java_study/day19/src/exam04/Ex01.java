package exam04;

public class Ex01 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<Apple>();
        //Box<Apple> appleBox = new Box<>(); // 뒤는 연산자만 넣어도 가능
        appleBox.put(new Apple());
        appleBox.showInfo();

        //Apple apple = appleBox.get();
        //apple.showInfo();

        Box<Melon> melonBox = new Box<Melon>();
        melonBox.put(new Melon());
        melonBox.showInfo();
    }
}
