package exam05.config;

import exam05.Message;
import exam05.Message2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppCtx {
    @Bean
    public Message message() {
        return new Message();
    }

    @Scope("prototype") // 기본: 싱글턴 / 매번 조회때마다 객체 생성
    @Bean(initMethod = "init", destroyMethod = "close") // 외부에서 제공받은 라이브러리 호출하기 위한 Bean (외부자원)
    public Message2 message2() {
        return new Message2();
    }
}
