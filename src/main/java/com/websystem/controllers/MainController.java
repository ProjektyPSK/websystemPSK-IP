package com.websystem.controllers;

import com.websystem.services.OrdersService;
import com.websystem.services.ProductsService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/index")
public class MainController {

    public List<String> e = new ArrayList<String>();

    public List<String> o = new ArrayList<String>();

    public List<String> p = new ArrayList<String>();

    @Qualifier("OrdersService")
    private OrdersService oService;

    @Qualifier("ProductService")
    private ProductsService pService;
}
