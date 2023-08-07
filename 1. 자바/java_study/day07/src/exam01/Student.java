package exam01;

public class Student {
    int id;
    String name;
    String subject;

    /*
    public Student() {  // 기본 생성자
        // 무조건 생성된 객체의 주소값만 반환
        // 반한괎 자료형 정의 불가
        // return X
        // 객체 생성 이후...
        // 멤버 변수(인스턴스 변수)

        id=1000;
        name="이름1";
        subject="과목1";
    }
     */
    
    public Student() { // 생성자 오버로딩
        id = 1000;
        name = "학생1";
        subject = "과목1";
    } 

    public Student(int id2, String name2, String subject2) {
        id = id2;
        name = name2;
        subject = subject2;
    }

    void showInfo() {
        System.out.printf("id=%d, name=%s, subject=%s%n", id, name, subject);
    }
}
