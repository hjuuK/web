package exam02.config;

import exam02.aopex.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
//@EnableAspectJAutoProxy(proxyTargetClass = true) // 서브클래스 기반, 클래스 기반의 프록시 (proxyTargetClass = true) / false(기본값)
@EnableAspectJAutoProxy
public class AppCtx {
    @Bean
    public ProxyCache proxyCache() {
        return new ProxyCache();
    }

    @Bean
    public ProxyCalculator proxyCalculator() {
        return new ProxyCalculator();
    }

    @Bean
    public Calculator calculator() {  // proxyTargetClass = false(기본값) 일반적으로는 인터페이스 기반 프록시이다. 프록시는 인터페이스의 하위 클래스로 생성
        return new RecCalculator();
    }

//    @Bean
//    public RecCalculator calculator() { // proxyTargetClass = true (클래스 기반 프록시)
//        return new RecCalculator();
//    }
}
