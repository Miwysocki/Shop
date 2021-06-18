package com.example.demo.order;
import com.example.demo.customer.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class OrderService {
    private final OrderRepository orderRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderService.class);
    @Autowired
    public OrderService(OrderRepository orderRepository) { this.orderRepository = orderRepository; }
    public List<Orders> getOrders() {
        return orderRepository.findAll();
    }

    public void addOrder(Orders order){
        LOGGER.info("Saving order " + order.getId());

        orderRepository.save(order);
    }

}
