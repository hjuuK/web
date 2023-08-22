package exam02.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

import java.util.HashMap;
import java.util.Map;

@Order(1) // 순서 재시하여 순서 제어
@Aspect
public class ProxyCache {
    private Map<Long, Object> cache = new HashMap<>();

    @Around("exam02.aopex.CommonPointcut.publicTarget()") // 공유 // 공통 기능을 수행할 메서드
    //@Around("execution(* exam02.aopex..*(..))")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        Long num = (Long)args[0];
        if (cache.containsKey(num)) { // 이미 캐시에 연산 결과가 있는 경우
            System.out.println("캐시 사용!!");
            return cache.get(num);
        }

        Object result = joinPoint.proceed(); // ProxyCalculator::proceed() 호출
        cache.put(num, result); // cache num을 저장
        System.out.println("캐시 저장!!");
        return result;
    }
}
