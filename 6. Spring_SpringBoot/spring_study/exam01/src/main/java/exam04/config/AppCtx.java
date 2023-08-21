package exam04.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import exam04.models.member.*;
import org.springframework.context.annotation.FilterType;

@Configuration
/*
@ComponentScan(basePackages = "exam04.models",
        excludeFilters = @ComponentScan.Filter(type= FilterType.ANNOTATION, classes = ManualBean.class)) */
/*
@ComponentScan(basePackages = "exam04.models",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = MemberDao.class)) */
@ComponentScan(basePackages = "exam04.models",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ASPECTJ, pattern = "exam04.models..*Dao")) // ..*Dao -> Dao를 포함한 모든 하위 패키지 제외
public class AppCtx {
    /*
    @Bean
    public MemberDao memberDao() {
        System.out.println("수동 등록 빈!"); // 수동 등록 빈이 우선으로 호출됨
        return new MemberDao();
    }
     */
}

