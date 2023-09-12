package org.koreait.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SecurityConfig {   // localhost:3000 첫 로그인 화면 무력화
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        /* 회원 인증 설정 - 로그인 */
        http.formLogin(f -> {
           f.loginPage("/member/login")
                   .usernameParameter("userId")
                   .passwordParameter("userPw")
                   .successForwardUrl("/") // 성공하면 이동할 주소
                   .failureUrl("/member/login"); // 실패하면 이동할 주소
        });

        /* 회원 로그아웃 설정 */
        http.logout(f -> {
            f.logoutRequestMatcher(new AntPathRequestMatcher("/member/logout"))
                    .logoutSuccessUrl("/member/login"); // 로그아웃시 이동할 페이지
        });

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
