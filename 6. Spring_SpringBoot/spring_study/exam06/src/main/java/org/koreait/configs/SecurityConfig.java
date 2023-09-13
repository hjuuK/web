package org.koreait.configs;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.koreait.models.member.LoginFailureHandler;
import org.koreait.models.member.LoginSuccessHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import java.io.IOException;

@Configuration
public class SecurityConfig {   // localhost:3000 첫 로그인 화면 무력화
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        /* 회원 인증 설정 - 로그인 */
        http.formLogin(f -> {
           f.loginPage("/member/login")
                   .usernameParameter("userId")
                   .passwordParameter("userPw")
                   .successHandler(new LoginSuccessHandler())
                   .failureHandler(new LoginFailureHandler());
        });

        /* 회원 로그아웃 설정 */
        http.logout(f -> {
            f.logoutRequestMatcher(new AntPathRequestMatcher("/member/logout"))
                    .logoutSuccessUrl("/member/login"); // 로그아웃시 이동할 페이지
        });

        /* 회원 인가 설정(접근 통제) */

//        http.authorizeHttpRequests(c -> {
//            c.requestMatchers("/mypage/**").authenticated() // 회원 전용 -> 로그인 이후에 사용가능한 페이지
//                    .requestMatchers("/admin/**").hasAuthority("ADMIN") // 관리자 전용 페이지 (/admin이 포함된 경로)
//                    .anyRequest().permitAll(); // 나머지 페이지는 전체 접근 가능
//        });

        // 인가에 대한 상세한 통제
        http.exceptionHandling(c -> {
            c.authenticationEntryPoint((req, res, e) -> {
                String URI = req.getRequestURI();
                if (URI.indexOf("/admin") != -1) { // 관리자 페이지
                    res.sendError(HttpServletResponse.SC_UNAUTHORIZED, "NOT AUTHORIZED");     // 401
                } else { // 회원 전용 페이지
                    // 로그인 페이지 이동
                    res.sendRedirect(req.getContextPath() + "/member/login");
                }
            });
        });

        return http.build();
    }

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return w -> w.ignoring().requestMatchers(
            "/css/**",
                    "/js/**",
                    "/images/**",
                    "/uploads/**",
                    "/admin/css/**"
        );
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
