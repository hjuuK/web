package org.koreait.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableJpaAuditing // 알아서 설정이 활성화(변화감지를 통해서 추가)
public class MvcConfig implements WebMvcConfigurer {
}
