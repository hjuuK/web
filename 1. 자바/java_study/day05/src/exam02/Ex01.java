package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.id = 20210557;
        s1.name = "김혜주";
        s1.subject = "JAVA";

        System.out.printf("id=%d, name=%s, subject=%s%n", s1.id, s1.name, s1.subject);

        s1.study();
    }
}
