package com.websystem.services;

import com.websystem.entity.Employee;
import com.websystem.entity.Role;
import com.websystem.repository.EmployeeRepository;
import org.hibernate.secure.spi.GrantedPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Transactional(readOnly = true)
    public UserDetails checkLoginAndPassword(String login, String password) {
        Employee employee = employeeRepository.findByLogin(login);
        if(employee == null) throw new UsernameNotFoundException(login);

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        for (Role role : employee.getRoles()){
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return new org.springframework.security.core.userdetails.User(employee.getLogin(), employee.getPass(),grantedAuthorities);

    }
}
