package com.example.demo.Product;

import com.example.demo.customer.Customer;
import com.example.demo.customer.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.List;

@Configuration
public class TestProducts {

    @Bean
    CommandLineRunner ProTestRun(
            ProductRepository repository) {
        return args -> {
            Product p = new Product();
            p.setName("Masło");
            p.setPrice(new BigDecimal(2));
            p.setDescription("świeże");

            repository.saveAll(
                    List.of(p)
            );
        };
    }
}
