package com.example.SpringBoot.SpringSecurity.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity

public class SecurityConfig {

	// This method used for encoding password and use Bcrypt which is a salt
	// mechanicsm security provider.

	@Bean
	private PasswordEncoder passEncoder() {
		return new BCryptPasswordEncoder();
	}

	// This method is used for user and admin authentication

	@Bean
	private UserDetailsService userDetailsService() {

		// UserDetails admin = User.withUsername("Vishal")
		// 		.password(pe.encode("vishal123")).roles("ADMIN").build();

		// UserDetails nonadmin = User.withUsername("Devansh")
		// 		.password(pe.encode("devansh123")).roles("USER").build();

		// return new InMemoryUserDetailsManager(admin,nonadmin);

		// Now We are using an external database so we don't need inMemory method.
		return new UserConfigUserDetailService();

	}

	// Cross-Site Request Forgery (CSRF) is an attack that forces
	// authenticated users to submit a request to a Web application
	// against which they are currently authenticated.

	@Bean
	public SecurityFilterChain securityFilter(HttpSecurity http) throws Exception {
		return http
			.csrf().disable()
			.authorizeHttpRequests(auth -> auth
				.requestMatchers("/products/new").permitAll()
				.anyRequest().authenticated()
			)
			.formLogin()
			.and()
			.build();
	}

	@Bean
	public AuthenticationProvider provider() {
		DaoAuthenticationProvider dap = new DaoAuthenticationProvider();
		dap.setUserDetailsService(userDetailsService());
		dap.setPasswordEncoder(passEncoder());
		return dap;
	}

	// For JWT
	@Bean
	public AuthenticationManager AuthManager(AuthenticationConfiguration config)throws Exception{
            return config.getAuthenticationManager();
	}
}
