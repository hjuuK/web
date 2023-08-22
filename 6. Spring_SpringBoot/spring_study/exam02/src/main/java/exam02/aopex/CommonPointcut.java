package exam02.aopex;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CommonPointcut {
    @Pointcut("execution(* exam02.aopex..*(..))")   // 공통 기능 적용 범위
    public void publicTarget() {}
}
