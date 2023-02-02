package mybaproject.rowonshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import lombok.RequiredArgsConstructor;

@EnableWebSecurity
public class SecurityConfiguration {
 
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		/* @formatter:off */
		http
			.authorizeRequests()
				.antMatchers("/", "/home").permitAll() // 설정한 리소스의 접근을 인증절차 없이 허용
				.anyRequest().authenticated() // 그 외 모든 리소스를 의미하며 인증 필요
				.and()
			.formLogin()
				.loginPage("/login") // 기본 로그인 페이지
				.permitAll()
				.and()
			.logout()
				.permitAll();
		
		return http.build();
		/* @formatter:on */
	}
 
	@Bean
	public UserDetailsService userDetailsService() {
		/* @formatter:off */
		UserDetails user =
			 User.withDefaultPasswordEncoder()
				.username("user")
				.password("password")
				.roles("USER")
				.build();
		/* @formatter:on */
 
		return new InMemoryUserDetailsManager(user); // 메모리에 사용자 정보를 담는다.
	}
}