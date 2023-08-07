package exam03;

import java.lang.annotation.Annotation;
import java.util.Arrays;

@MyAnno(value={"값3", "값4"}, min=10, max=100)
public class Ex02 {
    public static void main(String[] args) {
        Class cls = Ex02.class;

        //Annotation anno = cls.getAnnotation(MyAnno.class);
        MyAnno anno = (MyAnno) cls.getAnnotation(MyAnno.class);
        //String value = anno.value();
        //System.out.println(value);

        String[] values = anno.value();
        System.out.println(Arrays.toString(values));
        int min = anno.min();
        int max = anno.max();
        System.out.printf("min=%d, max=%d%n", min, max);
    }
}
