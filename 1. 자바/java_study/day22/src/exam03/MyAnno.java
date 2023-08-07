package exam03;

import static java.lang.annotation.ElementType.*;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({TYPE, METHOD, FIELD}) //@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno { // extends java.lang.annotation.Annotation
    String[] value() default {"값", "값2"}; // value를 입력하지 않아도 "값"이 들어가있음
    int min() default 0;
    int max() default 0;
}
