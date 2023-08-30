package config;

import config.interceptors.MemberOnlyInterceptor;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
@EnableWebMvc
@Import(DbConfig.class)
public class MvcConfig implements WebMvcConfigurer {
/*
    @Autowired
    private JoinValidator joinValidator;

    @Override
    public Validator getValidator() {
        return joinValidator;
    }


 */

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(memberOnlyInterceptor())
                .addPathPatterns("/mypage/**");
    }

    @Bean
    public MemberOnlyInterceptor memberOnlyInterceptor() {
        return new MemberOnlyInterceptor(); // 관리 객체 생성
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
        // 요청 유입 1. 컨트롤러 빈 -> 2. 정적 자원
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/") // url에 입력하는 주소
                .setViewName("main/index"); // 실제 입력한 주소에 대한 경로 연동 //.jsp

        registry.addViewController("/mypage")
                .setViewName("member/mypage");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/");
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/view/", ".jsp");
    }

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource ms = new ResourceBundleMessageSource();
        ms.setDefaultEncoding("UTF-8");
        ms.setBasenames("messages.commons");

        return ms;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer conf = new PropertySourcesPlaceholderConfigurer();
        conf.setLocations(
                new ClassPathResource("application.properties")
        );

        return conf;
    }
}
