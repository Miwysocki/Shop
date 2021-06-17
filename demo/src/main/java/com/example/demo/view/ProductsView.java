package com.example.demo.view;

import com.example.demo.Product.Product;
import com.example.demo.Product.ProductService;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Route("products")
@PageTitle("Products!")
public class ProductsView extends VerticalLayout {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductsView.class);
    private Set<Product> selected;
    private final ProductService productService;
    private TextField quantity;

    public ProductsView(ProductService productService) {
        this.productService = productService;
        List<Product> products = productService.getProducts();


        Grid<Product> grid = new Grid<>();
        grid.setItems(products);
        grid.addColumn(Product::getName).setHeader("Name");
        grid.addColumn(Product::getPrice).setHeader("Price");
        grid.addColumn(Product::getDescription).setHeader("Description");
        grid.setSelectionMode(Grid.SelectionMode.MULTI);

        grid.addSelectionListener(event -> {
            this.selected = event.getAllSelectedItems();
        });
        grid.addItemClickListener(event ->
                UI.getCurrent().getPage().setLocation("http://localhost:9090//" + event.getItem().getId()));
        add(grid);
        add(quantity = new TextField("quantity"));
        add(new Button("Add to a cart", event -> AddSelected( Integer.parseInt(quantity.getValue()))));
    }

    private void AddSelected(int quantity) {
        if (this.selected.size() == 0) return;
        List<Product> inCart = new ArrayList<>();
        for (Product p : this.selected) {
            for(int i =0; i< quantity;i++){
                inCart.add(p);
            }
            LOGGER.info("Product " + p.getName() + " added to a cart");
        }
    }
}
