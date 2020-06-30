package com.websystem.controller;

import com.websystem.entity.Products;
import com.websystem.repository.ProductsRepository;
import com.websystem.services.MailNotifications;
import com.websystem.services.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductsController {

    @Autowired
    ProductsRepository productsRepository;
    @Autowired
    MailService mailService;
    @Autowired
    MailNotifications mailNotifications;

    @RequestMapping("/user/showproducts")
    public String showAllProducts(Model model) {
        List<Products> all = productsRepository.findAll();
        model.addAttribute("products", all);

        return "allproducts";
    }

    @RequestMapping("/productProcess")
    public String addNewProduct(@ModelAttribute("product") Products product, ModelMap model) {
        productsRepository.save(product);
        Thread newProductAdded = new Thread(()->{
            mailNotifications.sendEmail("Added new Product","New product was added in DB!");
        }
        );
        newProductAdded.start();
        return "addProductSuccess";
    }


}
