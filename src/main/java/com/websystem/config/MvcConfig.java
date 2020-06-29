package com.websystem.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/user/home").setViewName("home");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/admin/registration").setViewName("registration");
        registry.addViewController("/user/showproducts").setViewName("allproducts");
        registry.addViewController("/showRegistrationPage").setViewName("userRegistration");
        registry.addViewController("/showRegistrationAdmin").setViewName("registration");
        registry.addViewController("/registrationProcess").setViewName("welcome");
        registry.addViewController("/productProcess").setViewName("addProductSuccess");
        registry.addViewController("/user/addProduct").setViewName("addProduct");
        registry.addViewController("/").setViewName("login");
    }

}
