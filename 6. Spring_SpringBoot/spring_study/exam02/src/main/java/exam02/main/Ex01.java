package exam02.main;

import exam02.aopex.*;
import exam02.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Calculator cal = ctx.getBean(Calculator.class); // 인터페이스 기반 프록시 (표준)
        //Calculator cal = ctx.getBean(RecCalculator.class); // 클래스 기반 프록시

        long result = cal.factorial(10); // 저장
        System.out.println(result);
        result = cal.factorial(10); // 사용⬇
        System.out.println(result);
        result = cal.factorial(10);
        System.out.println(result);
        result = cal.factorial(10);
        System.out.println(result);
        result = cal.factorial(10);
        System.out.println(result);


        ctx.close();
    }
}
