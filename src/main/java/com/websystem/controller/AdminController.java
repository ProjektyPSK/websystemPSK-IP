package com.websystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

    @RequestMapping(value = "/admin/registration", method = RequestMethod.GET)
    public ModelAndView adminRegistration() {
        System.out.println("registration");
        return new ModelAndView("registration");
    }
}
