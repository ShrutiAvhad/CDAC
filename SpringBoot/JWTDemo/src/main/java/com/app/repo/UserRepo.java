package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> 
{ // Adjust ID type (Long/Integer) to match your User entity
    
    User findByUsername(String username);
}