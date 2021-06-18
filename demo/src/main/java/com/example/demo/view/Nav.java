package com.example.demo.view;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.RouterLink;

public class Nav extends AppLayout {
    public Nav(){
        Tabs tabs = new Tabs(new Tab(new RouterLink("Home", HomeView.class)), new Tab(new RouterLink("Products", ProductsView.class)), new Tab(new RouterLink("Cart", CartView.class)), new Tab(new RouterLink("Register", CustomerForm.class)));
        addToNavbar(tabs);
    }
}
