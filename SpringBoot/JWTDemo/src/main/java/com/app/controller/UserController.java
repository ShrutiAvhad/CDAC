package com.app.controller;

import com.app.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder.BCryptVersion;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.User;
import com.app.service.UserService;

@RestController
public class UserController {
	
	private final JwtService jwtService;
	@Autowired
	private UserService userService;
	private BCryptPasswordEncoder byBCryptPasswordEncoder = new BCryptPasswordEncoder(10);
	
	private BCryptPasswordEncoder byBCryptPasswordEncoder1 = new BCryptPasswordEncoder(BCryptVersion.$2A, 10);
	
	@PostMapping("/register")
	public User register(@RequestBody User user)
	{
		user.setPassword(byBCryptPasswordEncoder.encode(user.getPassword()));
		System.out.println("Password : "+user.getPassword());
		return userService.saveUser(user);
	}
	
	@Autowired
	AuthenticationManager authenticationManager;

	UserController(JwtService jwtService) {
		this.jwtService = jwtService;
	}
	
	@PostMapping("/login")
	public String login(@RequestBody User user)
	{
		Authentication authentication = authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword()));
		
		if(authentication.isAuthenticated())	
		{
			return jwtService.generateToken(user.getUsername());
		}
		else
		{
			return "login failed";
		}
		
	}
}
