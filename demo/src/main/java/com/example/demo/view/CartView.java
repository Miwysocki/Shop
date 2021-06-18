package com.example.demo.view;

import com.example.demo.Product.Product;
import com.example.demo.mail.MailSender;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.Page;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Route("cart")
@PageTitle("Cart")
public class CartView extends VerticalLayout {
    private static final Logger LOGGER = LoggerFactory.getLogger(CartView.class);
    private Set<Product> selected;
    public static ArrayList<Product> inCart;

    public CartView() {
        
        Nav navbar = new Nav();
        add(navbar);
        if(inCart != null){
            //giving new ID in cart so they
            for(int i=0; i < inCart.size();i++){
//                if(i == 0 ){inCart.get(i).setId(0);}
//                else
//                    inCart.get(i).setId(inCart.get(i-1).getId()+1);
                inCart.get(i).setId(i);
            }

            Grid<Product> grid = new Grid<>();
            grid.setItems(inCart);
            grid.addColumn(Product::getId).setHeader("ID");
            grid.addColumn(Product::getName).setHeader("Name");
            grid.addColumn(Product::getDescription).setHeader("Description");
            grid.addColumn(Product::getPrice).setHeader("Price");
            grid.setSelectionMode(Grid.SelectionMode.MULTI);

            grid.addSelectionListener(event -> {
                this.selected = event.getAllSelectedItems();
            });
            grid.addItemClickListener(event ->
                    UI.getCurrent().getPage().setLocation("http://localhost:9090//" + event.getItem().getId()));
            add(grid);

            add(new Button("back go products", event -> goShoppig()));
            add(new Button("Delete", event -> DeleteSelected()));
            add(new Button("Finalize", event -> Finalize()));
            add(new Button("send email!", event -> sendTestEmail()));
        }
        else{
            //nothhig in the cart
            add(new H1("Your cart is empty"));
            add(new Button("go shoping!", event -> goShoppig()));
        }
    }
    private void sendTestEmail(){
        sendEmail("przemyslaw.wiszniewski@o2.pl","test","bizjav");
    }
    private void sendEmail(String to, String subject, String message){
        MailSender ms = new MailSender();
        ms.sendSimpleMessage(to,subject,message);
    }

    private void goShoppig() {
        UI.getCurrent().navigate(ProductsView.class);
    }

    private void Finalize() {
    }

    private void DeleteSelected() {
        LOGGER.info("Removing selected Product from cart");
        if (this.selected.size() == 0) return;
        for (Product p : this.selected) {
            inCart.remove(p);
            LOGGER.info("Product " + p.getName() + " removed");
        }
        this.selected = new HashSet<>();
        UI.getCurrent().getPage().reload();
    }
}
