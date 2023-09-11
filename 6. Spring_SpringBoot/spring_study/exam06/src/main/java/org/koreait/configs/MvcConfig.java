package org.koreait.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableJpaAuditing  // JPA의 변화감지를 감독하고 코드 추가
public class MvcConfig implements WebMvcConfigurer {
}
