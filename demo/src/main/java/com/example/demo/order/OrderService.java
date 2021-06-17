package com.example.demo.order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class OrderService {
    private final OrderRepository orderRepository;
    @Autowired
    public OrderService(OrderRepository orderRepository) { this.orderRepository = orderRepository; }
    public List<Orders> getOrders() {
        return orderRepository.findAll();
    }

    /*public Order getOrder(Integer id){
        return orderRepository.findById(id);
    }*/
}
