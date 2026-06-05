package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.app.model.User;
import com.app.repo.UserRepo;

@Service
public class UsersDetailsService implements UserDetailsService{

	@Autowired
	private UserRepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = repo.findByUsername(username);
		System.out.println("User = "+user);
		if(user == null)
		{
			System.out.println("user 404");
			throw new UsernameNotFoundException("User 404");
		}
		
		return new UserPrincipal(user);
	}
	
}
