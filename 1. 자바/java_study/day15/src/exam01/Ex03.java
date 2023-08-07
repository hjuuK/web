package exam01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Ex03 {
    public static void main(String[] args) {
        Class cls1 = Student.class; // Class class 객체

        Field[]  fields = cls1.getFields(); // 멤버 변수
        for (Field field : fields) {
            System.out.println(field); //public만 보임
        }

        Method[] methods = cls1.getMethods(); // 메서드
        for (Method method : methods) {
            System.out.println(method);
        }

        Constructor[] constructors = cls1.getConstructors(); // 생성자 목록
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        //Student s1 = new Student();
        //Class sl2 = s1.getClass();  // 내부에서 객체의 정보를 확인할 때 많이 사용
    }
}
