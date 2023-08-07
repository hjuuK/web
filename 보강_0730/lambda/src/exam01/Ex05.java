package exam01;

public class Ex05 {
    public static void main(String[] args) {
        MyLambda f1 = s -> System.out.println(s);
        f1.print("출력!");

        MyLambda2 f2 = () -> System.out.println("출력!");
        f2.print();
    }
}
