package exam01;

public class Ex05 {
    public static void main(String[] args) {
        Student s1 = new Student(1000,"학생1", "과목1");
        Student s2 = new Student(1000,"학생1", "과목1");
        System.out.println(s1 == s2); // false => 주소가 다름 // 284720968 != 1534030866 // 동일성 비교
        System.out.println("s1.hashCode() : " + s1.hashCode());
        System.out.println("s2.hashCode() : " + s2.hashCode());
        System.out.println(s1.equals(s2)); // 동등성 비교

        //int num1 = 10;
       // int num2 = 10;
        //System.out.println(num1 == num2); // 10은 리터럴상수이기 때문에 주소가 동일함 // 동일성 비교


    }
}
