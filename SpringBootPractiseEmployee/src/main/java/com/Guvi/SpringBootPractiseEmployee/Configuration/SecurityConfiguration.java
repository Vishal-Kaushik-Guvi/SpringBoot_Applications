package com.Guvi.SpringBootPractiseEmployee.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.Guvi.SpringBootPractiseEmployee.Service.UserServiceConfig;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

@Autowired
@Lazy
private UserServiceConfig userService;


@Bean
public BCryptPasswordEncoder passwordEncoder(){
    return  new BCryptPasswordEncoder();
}

//create DaoAuthentication Provider
@Bean
public DaoAuthenticationProvider authenticationProvider(){
    DaoAuthenticationProvider auth=new DaoAuthenticationProvider();
    auth.setUserDetailsService(userService);
    auth.setPasswordEncoder(passwordEncoder());
    return auth;
}

@Bean
public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    //implement
    http.csrf().disable()
            .cors().disable()
            .authorizeHttpRequests().requestMatchers(
                    "/registration**",
                            "js/**","/css/**","/img/**")
            .permitAll()
            .anyRequest()
            .authenticated()
            .and()
            .formLogin()
            .loginPage("/login")
            .permitAll()
            .and()
            .logout()
            .invalidateHttpSession(true)
            .clearAuthentication(true)
            .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
            .logoutSuccessUrl("/login?logout")//redirect to login page
            .permitAll()
            .and()
            .authenticationProvider(authenticationProvider());


    return http.build();
}


}