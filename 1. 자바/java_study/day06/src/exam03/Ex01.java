package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 20210557;
        s1.name = "김혜주";
        s1.subject = "JAVA";
        s1.showInfo();
        System.out.println(System.identityHashCode(s1));

        Student s2 = new Student();
        s2.id = 20201025;
        s2.name = "슨배릠";
        s2.subject = "윈도우즈 프로그래밍";
        s2.showInfo();
        System.out.println(System.identityHashCode(s2));

        Student s3 = s2; // s3은 s2의 주소값 저장
        s3.showInfo();
        System.out.println(System.identityHashCode(s3));
        System.out.println("s3 == s2 : " + (s3 == s2));
        System.out.println("s1 == s2 : " + (s1 == s2));

        s3.name = "홍길동";
        s3.showInfo();
        s2.showInfo();
    }
}
