package exam03;

public class Ex02 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1001;
        s1.showInfo(); // 인스턴스 메서드 -> 객체가 만들어진 다음에 접근 가능

        Student s2 = new Student(1002, "이름2", "과목2");
        s2.showInfo();
    }
}
