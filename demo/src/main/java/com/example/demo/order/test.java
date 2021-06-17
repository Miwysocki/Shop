package com.example.demo.order;

import com.example.demo.customer.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Configuration
public class test {
    @Bean
    CommandLineRunner testRun(
            OrderRepository rep, CustomerRepository cuRep) {
        return args -> {
//            Orders nowy =  new Orders(
//            );
//            nowy.setFinal_price(10);
//
//            nowy.setCustomer(cuRep.getById(1));
//            nowy.setId(99);
//
//            rep.saveAll(
//                    List.of(nowy)
//            );
        };
    }
}
