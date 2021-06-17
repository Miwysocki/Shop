package com.example.demo.Product;

import com.example.demo.customer.Customer;
import com.example.demo.customer.CustomerRepository;
import com.example.demo.customer.CustomerService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {

    private final ProductRepository rep;
    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.rep = productRepository;
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductService.class);

    public List<Product> getProducts() {
        LOGGER.info("Listing products");
        return rep.findAll();
    }

    public void addProduct(Product product){
        LOGGER.info("Saving product " + product.getName());
        rep.save(product);
    }

    public void deleteProduct(Product product){
        LOGGER.info("Saving product " + product.getName());
        rep.delete(product);
    }

}
