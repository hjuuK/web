package exam02;

public class Box<T extends Fruit & Eatable> {   // T - Type
    // private static T item2; // static 사용 불가
    // private T[] items = new T[3]; // 배열 생성 불가
    private T item; // 지네릭 클래스의 T -> 객체 생성시 타입 결정

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void printItem() {
        item.print();
    }
    
    public <T,U> void method1(T t, U u) {
            // 지네릭 메서드의 T, 메서드 호출시에 타입 결정
    }    
}
