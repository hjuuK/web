package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();  //Box<Apple> appleBox = new Box<Apple>();
        appleBox.setItem(new Apple());  // 타입 안정성 확보
        Apple item = appleBox.getItem();    // 형변환의 번거러움을 해소


    }
}
