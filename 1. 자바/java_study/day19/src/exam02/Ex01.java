package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Box appleBox = new Box();
        appleBox.put(new Apple());
        Apple apple = (Apple)appleBox.get(); // 형변환
        apple.showInfo();


        /*
        Box melonBox = new Box();
        melonBox.put(new Melon());
        Melon melon = (Melon)melonBox.get();
        melon.showInfo();
         */
    }
}
