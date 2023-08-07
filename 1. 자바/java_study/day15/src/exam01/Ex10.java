package exam01;

import java.util.HashSet;

public class Ex10 {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<Student>();
        students.add(new Student(1000,"학생1","과목1"));
        students.add(new Student(1000,"학생1","과목1"));
        students.add(new Student(1001,"학생2","과목2"));
        students.add(new Student(1002,"학생3","과목3"));

        // 객체의 동등성 비교 - equals(), hashCode()..  // hashCode() => 중복 제거

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
