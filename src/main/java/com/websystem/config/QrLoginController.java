package com.websystem.config;

import com.websystem.entity.User;
import com.websystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RestController
public class QrLoginController {

    @Autowired
    private UserRepository userRepository;

    ExecutorService executorService = Executors.newSingleThreadExecutor();


    @PostMapping("/api/userqrlogin/{token}")
    public ResponseEntity<?> qrLoginWithToken(User user, @PathVariable("token") String token) {
        User user1 = userRepository.findByUsername(user.getUsername());
        if (user1 == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>("message", HttpStatus.OK);
    }

    @PostMapping("/api/user/clientLogin")
    public ResponseEntity<?> qrLoginClientAuthentication(@RequestBody User user) {
        User user1 = userRepository.findByUsername(user.getUsername());
        if (user1 == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }




}
