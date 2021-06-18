package com.example.demo.customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CustomerConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            CustomerRepository repository) {
        return args -> {
         Customer nowy =  new Customer(
                  1,
                  "Janusz",
                  "jan",
                  "pass"
          );

         repository.save(nowy);
         /*
          repository.saveAll(
                  List.of(nowy)
          );

          */
        };
    }

}
