package com.websystem.services;

import com.websystem.entity.Orders;
import com.websystem.repository.OrdersRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OrdersService {

    private OrdersRepository ordersRepository;

    public Orders save(Orders orders) {
        return ordersRepository.save(orders);
    }

    public ArrayList<Orders> getCustomers() {
        return (ArrayList<Orders>) ordersRepository.findAll();
    }


}
