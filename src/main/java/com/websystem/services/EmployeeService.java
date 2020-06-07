package com.websystem.services;

import com.websystem.entity.Employee;
import com.websystem.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void checkLoginAndPassword(String login, String password) {
        Employee employee = employeeRepository.findByLogin(login);


        if (login.equals(employee.getLogin()) && password.equals(employee.getPass())){
            System.out.println("Login Success");
        }else{
            System.out.println();
        }

    }
}
