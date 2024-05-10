package com.Guvi.SpringBootPractiseEmployee.Service;


import org.springframework.security.core.userdetails.UserDetailsService;

import com.Guvi.SpringBootPractiseEmployee.DTO.UserRegistrationDto;
import com.Guvi.SpringBootPractiseEmployee.Entity.User;

public interface UserServiceConfig extends UserDetailsService {
 User save(UserRegistrationDto registrationDto);
}
