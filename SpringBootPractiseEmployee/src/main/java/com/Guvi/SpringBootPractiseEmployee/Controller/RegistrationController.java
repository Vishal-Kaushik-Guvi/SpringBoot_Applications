package com.Guvi.SpringBootPractiseEmployee.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Guvi.SpringBootPractiseEmployee.DTO.UserRegistrationDto;
import com.Guvi.SpringBootPractiseEmployee.Service.UserServiceConfig;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

  @Autowired
  private UserServiceConfig userService;

  public RegistrationController(UserServiceConfig userSerivce) {
    super();
    this.userService = userSerivce;
  }

  @GetMapping
  public String showRegistrationForm(Model model) {
    model.addAttribute("user", new UserRegistrationDto());
    return "registration";
  }

  @PostMapping
  public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
    System.out.println("password " + registrationDto.getPassword());
    // call save to register the user
    userService.save(registrationDto);
    // return registration page with success message
    return "redirect:/registration?success";
  }
}
