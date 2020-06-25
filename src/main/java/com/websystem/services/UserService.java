package com.websystem.services;

import com.websystem.entity.User;
import com.websystem.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService{

    UserRepository userRepository;
    PasswordEncoder pass;

    public UserService(UserRepository userRepository, PasswordEncoder pass) {
        this.userRepository = userRepository;
        this.pass = pass;
    }

    public User save(User user){
        user.setPassword(pass.encode(user.getPassword()));

        userRepository.save(user);
        return user;
    }


}
