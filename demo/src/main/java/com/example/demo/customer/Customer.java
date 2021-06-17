package com.example.demo.customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import org.hibernate.annotations.Index;
//import org.springframework.data.relational.core.mapping.Table;
import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table//(name="Customer", indexes={ @Index(columnList="CustomerID") })
public class Customer {

//    @Column(name="CustomerID", nullable=false, unique=true, length=10)
//    @Id
//    @GeneratedValue(generator="CUSTOMER_CUSTOMERID_GENERATOR")
//    @org.hibernate.annotations.GenericGenerator(name="CUSTOMER_CUSTOMERID_GENERATOR", strategy="native")
//    private int customerID;

    @Id
    @SequenceGenerator(
            name = "customer_sequence",
            sequenceName = "customer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_sequence"
    )
    private int id;

    private String name;
    private String nickname;
    private String password;
    private String email;
    private String city;
    private String street;
    private String zipCode;

    //private int discount;

    public Customer(int id, String name, String nickname, String password) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
        this.password = password;
       // this.discount = discount;
    }
}
