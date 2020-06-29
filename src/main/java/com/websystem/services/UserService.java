package com.websystem.services;

import com.websystem.entity.User;
import com.websystem.model.Login;
import com.websystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserService {

    @Autowired
    PasswordEncoder pass;
    @Autowired
    public UserRepository userRepo;

    public void addUser(User user) {
        userRepo.save(user);
    }

    public User validateUser(Login login) {
        return userRepo.findByUsername(login.getUsername());
    }

    public User save(User user) {
        user.setPassword(pass.encode(user.getPassword()));

        userRepo.save(user);
        return user;
    }
}
