package com.example.demo.view;

import com.example.demo.customer.Customer;
import com.example.demo.customer.CustomerRepository;
import com.example.demo.customer.CustomerService;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;


@Route(value = "CustomerForm")
@PageTitle("Welcome!")
public class CustomerForm extends VerticalLayout {

    private TextField name;
    private TextField nickname;
    private PasswordField password;
    private TextField email;
    private TextField city;
    private TextField street;
    private TextField zipCode;
    private Button save;
    private CustomerRepository repo;
    private Binder<Customer> binder = new Binder<>(Customer.class);

    public CustomerForm(CustomerRepository repo) {


        setSizeFull();
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);
        this.repo = repo;
        addClassName("hello-world-view");
        name = new TextField("Your name");
        nickname = new TextField("Your nickname");
        password = new PasswordField("Your password");
        email = new TextField("Your email");
        city = new TextField("Your city");
        street = new TextField("Your street");
        zipCode = new TextField("Your zipCode");
        save = new Button("Save");
        add(name,nickname,password,email,city,street,zipCode, save);
      //  setVerticalComponentAlignment(Alignment.END, name, sayHello);


        save.addClickListener(e -> {
            Notification.show("Hello " + name.getValue());
            Customer newCustomer = new Customer(name.getValue(),nickname.getValue(),password.getValue(), email.getValue(), city.getValue(),street.getValue(), zipCode.getValue());

            repo.save(newCustomer);
            UI.getCurrent().navigate(HomeView.class);
        });
    }

}