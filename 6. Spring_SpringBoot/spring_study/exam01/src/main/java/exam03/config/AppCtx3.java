package exam03.config;

import exam03.models.member.JoinValidator;
import exam03.models.member.MemberDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx3 {
    @Bean
    public MemberDao memberDao() {
        return new MemberDao();
    }

    @Bean
    public MemberDao memberDao2() { // 두 개 이상이면 오류 발생 -> 해결방법: @Qualifier
        return new MemberDao();
    }

    @Bean
    public JoinValidator joinValidator() {
        return new JoinValidator();
    }
}
