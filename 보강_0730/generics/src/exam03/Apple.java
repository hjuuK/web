package exam03;

public class Apple extends Fruit {
    public String toString() {
        return "사과";
    }

    public void print() {
        System.out.println(this); // this -> toString // this.toString()
    }
}
