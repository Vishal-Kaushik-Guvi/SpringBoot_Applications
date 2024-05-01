package com.example.SpringBoot.SpringSecurity.Entity;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
  
    // using optional class to overcome null pointer exception
    Optional<UserInfo> findByName(String name);
}
