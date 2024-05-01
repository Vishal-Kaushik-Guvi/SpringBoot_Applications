package com.example.SpringBoot.SpringSecurity.Configuration;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.SpringBoot.SpringSecurity.Entity.UserInfo;

public class UserConfigUserDetail implements UserDetails {

    private String name;
    private String password;

   private List<GrantedAuthority> authority;

    public UserConfigUserDetail(UserInfo userinfo){
       name=userinfo.getName();
       password= userinfo.getPass();
       authority = Arrays.stream(userinfo.getRoles().split(","))
       .map(SimpleGrantedAuthority::new).collect(Collectors.toList());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
       return authority;
    }

    @Override
    public String getPassword() {
       return password;
    }

    @Override
    public String getUsername() {
       return name;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
      return true;
    }

    @Override
    public boolean isEnabled() {
       return true;
    }

}