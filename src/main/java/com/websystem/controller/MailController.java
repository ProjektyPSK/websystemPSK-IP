package com.websystem.controller;

import com.websystem.services.MailService;
import org.springframework.web.bind.annotation.GetMapping;

public class MailController {
    private MailService mailService;

    public MailController(MailService mailService) {
        this.mailService = mailService;
    }

    @GetMapping("/sendemailWhenAddNewProduct")
    public String newProductEmailNotification() {
        mailService.sendSimpleEmail("Odbiorca <odbiorca@maila.pl>", "Test e-mail", "Testing email functionality");

        return "emailProductSent";
    }

    @GetMapping("/sendemailWhenAddNewUser")
    public String newUserEmailNotification() {
        mailService.sendSimpleEmail("Odbiorca <odbiorca@maila.pl>", "Test e-mail", "Testing email functionality");

        return "emailNewUSerSent";
    }

    @GetMapping("/sendemailWhenAddNewAdmin")
    public String newAdminEmailNotification() {
        mailService.sendSimpleEmail("Odbiorca <odbiorca@maila.pl>", "Test e-mail", "Testing email functionality");

        return "emailNewAdminSent";
    }

}
