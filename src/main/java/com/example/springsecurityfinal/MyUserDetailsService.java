package com.example.springsecurityfinal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    userRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//calling findByUsername method of userRepo
        Optional<User> user = userRepo.findByUsername(username);

        user.orElseThrow(()->new UsernameNotFoundException("Username not found"));

        return user.map(MyUserDetails::new).get();
    }
}
