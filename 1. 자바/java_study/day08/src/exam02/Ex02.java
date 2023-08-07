package exam02;

public class Ex02 {
    public static void main(String[] args) {
        //Student s1 = new Student();
        Student.id = 1000; // static 변수는 객체를 만들지 않고 클래스명으로 접근 가능
        System.out.println(Student.id);

        Class cls = Student.class;

        Student.staticMethod();
    }
}
