package com.websystem.controller;

import com.websystem.entity.Address;
import com.websystem.entity.Contact;
import com.websystem.entity.User;
import com.websystem.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class RegistrationController {

    @Autowired
    UserService userService;
    @Autowired
    ContactService contactService;
    @Autowired
    AddressService addressService;
    @Autowired
    MailNotifications mailNotifications;

    @PostMapping(value = "/registrationProcess")
    public String addUser(@ModelAttribute("user") User user, @ModelAttribute("contact") Contact contact, @ModelAttribute("address") Address address, ModelMap model) {
        contactService.addContact(contact);
        addressService.addAddress(address);
        user.setAddress(address);
        user.setContact(contact);
        userService.addUser(user);
        model.addAttribute("username", user.getUsername());
        Thread registrationNotification = new Thread(()->{
            mailNotifications.sendEmail("Created new User","New user account was created!");
        }
                );
        registrationNotification.start();
        return "welcome";
    }
}
