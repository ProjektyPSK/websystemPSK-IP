package com.websystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserController {

    @RequestMapping(value = "/user/welcome", method = {RequestMethod.POST})
    public ModelAndView welcome() {
        System.out.println("welcome");;
        return new ModelAndView("welcome");
    }

    @GetMapping({"/","/login"})
    public ModelAndView login() {
        System.out.println("login");
        return new ModelAndView("login");
    }


    @RequestMapping(value = "/admin/registration", method = RequestMethod.POST)
    public ModelAndView adminRegistration() {
        System.out.println("registration");
        return new ModelAndView("registration");
    }
    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ModelAndView userRegistration() {
        System.out.println("registration");
        return new ModelAndView("userRegistration");
    }

}
