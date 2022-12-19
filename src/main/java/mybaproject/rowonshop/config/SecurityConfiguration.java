package mybaproject.rowonshop.config;

//import jakarta.servlet.Filter;
//import lombok.RequiredArgsConstructor;
//import mybaproject.rowonshop.domain.users.service.UserService;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
//import org.springframework.boot.autoconfigure.security.ConditionalOnDefaultWebSecurity;
//import org.springframework.boot.autoconfigure.security.SecurityProperties;
//import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//
//import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import static org.springframework.security.config.Customizer.withDefaults;

//@EnableWebSecurity
//@Configuration
//@RequiredArgsConstructor
//public class SecurityConfiguration {
//    UserDetailsService UserService;
//    AuthenticationManager authenticationManager;
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        AuthenticationManagerBuilder authenticationManagerBuilder = http.getSharedObject(AuthenticationManagerBuilder.class);
//        authenticationManagerBuilder.userDetailsService(UserService);
//        authenticationManager = authenticationManagerBuilder.build();
//
//        http
//                .authenticationManager(authenticationManager);
//
//        return http.build();
//    }
//
//}