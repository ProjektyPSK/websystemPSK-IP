package com.websystem.controller;

import com.websystem.entity.Address;
import com.websystem.entity.Contact;
import com.websystem.entity.User;
import com.websystem.services.UserDetailsServiceImpl;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserController {

    private final UserDetailsServiceImpl userService;

    public UserController(UserDetailsServiceImpl userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/user/welcome", method = {RequestMethod.POST})
    public ModelAndView welcome() {
        System.out.println("welcome");
        ;
        return new ModelAndView("welcome");
    }

    @GetMapping({"/", "/login"})
    public ModelAndView login() {
        System.out.println("login");
        return new ModelAndView("login");
    }


    @RequestMapping(value = "/showRegistrationPage", method = RequestMethod.POST)
    public ModelAndView showRegistrationPage(ModelMap model) {
        model.addAttribute(new User());
        model.addAttribute(new Contact());
        model.addAttribute(new Address());

        return new ModelAndView("userRegistration");
    }


}
