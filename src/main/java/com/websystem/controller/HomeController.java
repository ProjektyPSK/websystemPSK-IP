package com.websystem.controller;

import com.websystem.entity.Products;
import com.websystem.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {


    @RequestMapping(value = "/user/home", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView homepage() {
        return new ModelAndView("home");
    }

    @RequestMapping("/admin/addProducts")
    public ModelAndView showAddingNewProductPage(ModelMap model){
            model.addAttribute(new Products());
        return new ModelAndView("userRegistration");
    }
}
