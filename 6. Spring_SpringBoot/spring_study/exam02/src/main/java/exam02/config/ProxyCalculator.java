package exam02.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Order(2)
@Aspect // 공통 기능이 정의된 클래스
public class ProxyCalculator {
    @Around("exam02.aopex.CommonPointcut.publicTarget()") // 공유
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {
        long stime = System.nanoTime(); // 추가 공통 기능
        try {
            Object result = joinPoint.proceed(); // 핵심 기능 수행 : factorial(..)

            return result;
        } finally {
            long etime = System.nanoTime(); // 추가 공통 기능
            System.out.printf("걸린 시간 : %d%n", etime - stime);
        }
    }
}
