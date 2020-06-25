package com.websystem.repository;

import com.websystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    User findByUsername(String username);

    User findUserByIdAndUsername(Long id, String username);
}
