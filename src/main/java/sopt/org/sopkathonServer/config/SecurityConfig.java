package sopt.org.sopkathonServer.config;

import static org.springframework.security.config.http.SessionCreationPolicy.STATELESS;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .csrf().disable()
                .formLogin().disable()
                .httpBasic().disable()

                .authorizeHttpRequests()
                .requestMatchers("/cry").permitAll()
                .anyRequest().authenticated()  // WHITE_LIST에 포함되지 않는 나머지 요청은 모두 인증 필요!

                .and()
                .build();   // -> 스프링 빈으로 등록, 어플리케이션 실행 시 자동으로 필터에 등록된다!
    }
}
