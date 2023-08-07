package exam02;

public class Student {
    int id; // 변수정의
    String name;
    String subject;

    public Student() {
        // 생성자가 객체를 생성한 이후 처리할 작업
        // 작업 처리 시점, 멤버 변수에 공간이 할당된 상태
        id = 1000;
        name = "학생1";
        subject = "과목1";
        // 반환값은 주소값이고 주소값은 변하면 안되기 때문에 return 사용 불가
    }

    void showInfo() {
        System.out.printf("id=%d, name=%s, subject=%s%n", id, name, subject);
    }
}
