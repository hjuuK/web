package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student(); // s1은 지역 스택 영역 할당 // s1이 찾아갈 수 있는 주소값 반환 // 참조변수

        //System.out.println(s1); // 패키지.클래스@주소값(16진수)
        //System.out.println(System.identityHashCode(s1)); // 객체 주소값(정수)

        s1.id=1000;
        s1.name="학생1";
        s1.subject="과목1";
        s1.showInfo();
        System.out.println("s1="+System.identityHashCode(s1));

        Student s2 = new Student();
        s2.id = 1001;
        s2.name = "학생2";
        s2.subject = "과목2";
        s2.showInfo();
        System.out.println("s2="+System.identityHashCode(s2));

        Student s3 = s2; // s3에 s2의 주소값이 대입
        s3.id=1002;
        s3.name="학생3";
        s3.subject="과목3";
        s3.showInfo();
        s2.showInfo(); // s2 와 s3 의 변수정의를 공유했기에 값이 변함(같은 객체 주소값 이용) => 참조변수
        System.out.println("s3="+System.identityHashCode(s3));

    }
}
