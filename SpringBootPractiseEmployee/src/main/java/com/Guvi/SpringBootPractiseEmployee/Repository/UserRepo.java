package com.Guvi.SpringBootPractiseEmployee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Guvi.SpringBootPractiseEmployee.Entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {
 User findByEmail(String email);
}
