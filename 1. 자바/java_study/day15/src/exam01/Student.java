package exam01;

import java.util.Objects;

public class Student /*extends Object*/{
    private int id; // 학번
    private String name; // 이름
    private String subject; // 전공과목

    public Student() {

    }

    public Student(int id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /*
    @Override
    public String toString() { // 멤버변수의 확인용도로 주로 쓰임
        return "id = " + id + ", name = " + name + ", subject = " + subject;
    }
     */

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student)obj;
            if (student.id == id && student.name.equals(name) && student.subject.equals(subject)){
                return true;
            }
        }

        return false;
    }

    @Override
    public int hashCode() {
        int hash = Objects.hash(id, name, subject);
        return hash;
    }
}
