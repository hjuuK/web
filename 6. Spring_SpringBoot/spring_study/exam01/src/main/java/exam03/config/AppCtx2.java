package exam03.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import exam03.models.member.*;
import org.springframework.context.annotation.Import;

import java.time.format.DateTimeFormatter;

@Configuration
@Import(AppCtx3.class)
public class AppCtx2 { // 기본생성자 -> 의존성 해결 X
    @Bean
    public JoinService joinService() {
        return new JoinService();
    }

    @Bean
    public ListService listService() {
        return new ListService();
    }

    //@Bean
    public DateTimeFormatter dateTimeFormatter() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm");

        return formatter;
    }
}
