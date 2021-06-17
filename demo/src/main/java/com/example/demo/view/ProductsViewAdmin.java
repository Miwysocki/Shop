package com.example.demo.view;

import com.example.demo.Product.Product;

import com.example.demo.Product.ProductRepository;
import com.example.demo.Product.ProductService;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Route("productsAdmin")
@PageTitle("Products!")
public class ProductsViewAdmin extends VerticalLayout {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductsViewAdmin.class);
    private Set<Product> selected;
    private final ProductService productService;

    private ProductRepository rep;

    public ProductsViewAdmin(ProductService productService){
        this.productService = productService;
        List<Product> products = productService.getProducts();


        Grid<Product> grid = new Grid<>();
        grid.setItems(products);
        grid.addColumn(Product::getId).setHeader("ID");
        grid.addColumn(Product::getName).setHeader("Name");
        grid.setSelectionMode(Grid.SelectionMode.MULTI);

        grid.addSelectionListener(event -> {
            this.selected = event.getAllSelectedItems();
        });
//        grid.addItemClickListener(event ->
//                UI.getCurrent().getPage().setLocation("http://localhost:9090//" + event.getItem().getId()));
        add(grid);
        add(new Button("Delete", event -> DeleteSelected()));

        TextField name = new TextField("Name");
        TextField description = new TextField("description");
        TextField price = new TextField("price");
        this.add(new VerticalLayout(new H2("Add Product"),
                        name, description, price,
                        new Button("Add", (event) -> {
                            Product newProduct = new Product(name.getValue(),description.getValue(),new BigDecimal(price.getValue()));
                            productService.addProduct(newProduct);
                            UI.getCurrent().getPage().reload();
                        })
                )
        );

    }

    private void DeleteSelected() {
        LOGGER.info("Removing selected Product");
        if (this.selected.size() == 0) return;
        for (Product p : this.selected) {
            productService.deleteProduct(p);
            LOGGER.info("Product " + p.getName() + " deleted");
        }
        this.selected = new HashSet<>();
        UI.getCurrent().navigate(ProductsViewAdmin.class);
    }



}

