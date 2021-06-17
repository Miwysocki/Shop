package com.example.demo;

import com.example.demo.Product.Product;
import com.example.demo.Product.ProductRepository;
import com.example.demo.customer.Customer;
import com.example.demo.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)
@RestController
public class ShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);
	}

//	public static void test(){
//		//ProductRepository rep = new ProductRepository();
//		BigDecimal price = new BigDecimal("10.5");
//		Product p = new Product(1,"grabie","opis",price,1);
//		//rep.save(p);
//
//		CustomerService cs = new CustomerService;
//		cs.getCustomers();
//	}
}
