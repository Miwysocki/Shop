package com.example.demo.order;

import com.example.demo.customer.Customer;
import com.example.demo.Product.Product;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table
public class Orders {
    @Id
    @SequenceGenerator(
            name = "order_sequence",
            sequenceName = "order_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "order_sequence"
    )

    private int id;
    private Status status;
    @OneToMany
    private List<Product> products;
    private LocalDateTime date_ordered;
    @OneToOne
    private Customer customer;
    private int final_price;

}
