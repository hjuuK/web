package config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan("models")
public class AppCtx {
    @Bean(destroyMethod = "close")  // destroyMethod 로 자원해제 명령
    public DataSource dataSource() {
        DataSource ds = new DataSource();
        /* 연결 설정 */
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/spring6");
        ds.setUsername("spring6");
        ds.setPassword("aA!123456");

        /* 커넥션 풀 설정 */
        ds.setInitialSize(2);
        ds.setMaxActive(10); // 10개 이상 생성 안되도록
        ds.setTestWhileIdle(true);  // 유휴 상태에 있는 동안 검사할 지 여부 결정 , 기본값 : false
        ds.setTimeBetweenEvictionRunsMillis(3000); // 테스트하는 주기 , 기본값 : 5초(5000)
        ds.setMinEvictableIdleTimeMillis(30000); // 대기상태의 유휴 상태를 제거하고 다시 생성 , 기본값 : 60초(60000)

        return ds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }
}
