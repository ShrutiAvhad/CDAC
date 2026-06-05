package com.app.config;

import com.app.JwtDemoApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.authentication.configurers.userdetails.DaoAuthenticationConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	private final JwtDemoApplication jwtDemoApplication;


	SecurityConfig(JwtDemoApplication jwtDemoApplication) {
		this.jwtDemoApplication = jwtDemoApplication;
	}

	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http)
	{
		http.csrf(customizer -> customizer.disable());
		//http.authorizeHttpRequests(request -> request.anyRequest().authenticated());
		http.authorizeHttpRequests(request -> request.requestMatchers("/register","/login").permitAll().anyRequest().authenticated());
		//http.formLogin(Customizer.withDefaults());
		http.httpBasic(Customizer.withDefaults());
		http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)).addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
		return http.build();
	}
	
	@Bean
	UserDetailsService userDetailsService()
	{
		UserDetails user1 = User.withDefaultPasswordEncoder().username("Shruti").password("test123").roles("USER","MANAGER").build();
		UserDetails user2 = User.withDefaultPasswordEncoder().username("Aditya").password("test123").roles("USER").build();
		
		return new InMemoryUserDetailsManager(user1, user2);
	}
	
	@Bean
	AuthenticationProvider authenticationProvider()
	{
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider(userDetailsService);
		//provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		provider.setPasswordEncoder(new BCryptPasswordEncoder(10));
		System.out.println("Provider : "+provider);
		return provider;
	}
	
	@Autowired
	UserDetailsService userDetailsService;
	
	@Bean
	AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception
	{
		return config.getAuthenticationManager();
	}
	
	@Autowired
	private JwtFilter jwtFilter;
	
}
