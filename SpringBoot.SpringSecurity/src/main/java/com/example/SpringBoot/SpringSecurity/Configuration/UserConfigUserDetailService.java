package com.example.SpringBoot.SpringSecurity.Configuration;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.SpringBoot.SpringSecurity.Entity.UserInfo;
import com.example.SpringBoot.SpringSecurity.Entity.UserInfoRepository;

@Component
public class UserConfigUserDetailService implements UserDetailsService {

    @Autowired
    private UserInfoRepository userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
      Optional<UserInfo> userinfo = userRepo.findByName(username);
      return userinfo.map(UserConfigUserDetail::new)
      .orElseThrow(()->new UsernameNotFoundException("User with UserName + " +username+ " NotFound!!"));
    }

}
