package exam02;

public class Student {
    static int id;
    String name;
    String subject;

    void showInfo() { // 인스턴스 메서드
        System.out.printf("id=%d, name=%s, subject=%s%n", id, name, subject);
        staticMethod();
        id=100;
    }

    static void staticMethod() { // 정적 메서드  => this가 없음
        System.out.println("정적 메서드!");
        //this.showInfo();
        //this.name="";
    }
}
