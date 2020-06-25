package com.websystem.config;

import com.websystem.entity.Role;
import com.websystem.entity.User;
import com.websystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/api/user/registration")
    public ResponseEntity<?> register(@RequestBody User user){
        if(userRepository.findByUsername(user.getUsername()) != null){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        user.setRole(Role.USER);
        userRepository.save(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @GetMapping("/api/user/login")
    public ResponseEntity<?> authorization(Principal principal){
        if(principal == null || principal.getName() == null){
        return ResponseEntity.ok(principal);
        }
        return new ResponseEntity<>(userRepository.findByUsername(principal.getName()), HttpStatus.OK);
    }

    @GetMapping("/api/user/all")
    public ResponseEntity<?> getAllUsers(){
        return ResponseEntity.ok(userRepository.findAll());
    }

}
