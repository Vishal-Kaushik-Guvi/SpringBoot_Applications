package com.Guvi.SpringBootPractiseEmployee.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.Guvi.SpringBootPractiseEmployee.DTO.UserRegistrationDto;
import com.Guvi.SpringBootPractiseEmployee.Entity.Role;
import com.Guvi.SpringBootPractiseEmployee.Entity.User;
import com.Guvi.SpringBootPractiseEmployee.Repository.UserRepo;

@Service
public class UserServiceImplement implements UserServiceConfig {

  @Autowired
  private UserRepo userRepo;

  @Autowired
  private PasswordEncoder passwordEncoder;

  @Override
  public User save(UserRegistrationDto registrationDto) {
    User user = new User(
        registrationDto.getFirstName(),
        registrationDto.getLastName(),
        registrationDto.getEmail(),
        passwordEncoder.encode(registrationDto.getPassword()),
        Arrays.asList(new Role("ROLE_USER")));

    return userRepo.save(user);
  }

  private Collection<GrantedAuthority> rolesAuthority(Collection<Role> roles) {
    return roles.stream().map(role -> new SimpleGrantedAuthority(role.getRole())).collect(Collectors.toList());
  }

  @Override
  public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    User user = userRepo.findByEmail(email);
    if (user == null) {
      throw new UsernameNotFoundException("Invalid User Name");
    }
    return new org.springframework.security.core.userdetails.User(
        user.getEmail(),
        user.getPassword(),
        rolesAuthority(user.getRoles()));
  }
}
