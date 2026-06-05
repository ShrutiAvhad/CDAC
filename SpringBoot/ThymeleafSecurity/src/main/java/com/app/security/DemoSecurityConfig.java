package com.app.security;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class DemoSecurityConfig {

	@Bean
	UserDetailsManager userDetailsManager(DataSource dataSource)
	{
		
//		JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager();
//		
//		jdbcUserDetailsManager.setUsersByUsernameQuery(" ");
//		jdbcUserDetailsManager.setAuthoritiesByUsernameQuery(" ");
//		
//		return jdbcUserDetailsManager;
		
		return new JdbcUserDetailsManager(dataSource);
	}
	
//	@Bean
//	InMemoryUserDetailsManager userDetailsManager() {
//		UserDetails user1 = User.builder().username("Aditya").password("{noop}test123").roles("EMPLOYEE").build();
//		UserDetails user2 = User.builder().username("Shruti").password("{noop}test123").roles("EMPLOYEE", "MANAGER").build();
//		UserDetails user3 = User.builder().username("Vartika").password("{noop}test123").roles("EMPLOYEE", "MANAGER", "ADMIN").build();
//
//		return new InMemoryUserDetailsManager(user1, user2, user3);
//	}

	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(configurer ->
		configurer
		.requestMatchers("/").hasRole("EMPLOYEE")
		.requestMatchers("/leaders/**").hasRole("MANAGER")
		.requestMatchers("/systems/**").hasRole("ADMIN")
		.anyRequest().authenticated())
		
		.formLogin(
				form -> form.loginPage("/showMyLoginPage").loginProcessingUrl("/authenticateTheUser").permitAll())
				.logout(logout -> logout.permitAll())
				
				.exceptionHandling(configurer -> configurer.accessDeniedPage("/access-denied"));
		
		return http.build();
	}
}
