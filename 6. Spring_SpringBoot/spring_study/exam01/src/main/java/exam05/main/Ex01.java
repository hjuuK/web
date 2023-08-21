package exam05.main;

import exam05.Message;
import exam05.Message2;
import exam05.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class); // afterPropertiesSet 호출

        Message2 m1 = ctx.getBean(Message2.class); // 싱글턴 패턴으로 객체 생성
        Message2 m2 = ctx.getBean(Message2.class); // m1과 m2는 각각 다른 객체
        System.out.println(m1 == m2); // false // m1과 m2는 다른 형태의 객체

        ctx.close(); // close() 가 호출되면 destroy 호출됨
    }
}
