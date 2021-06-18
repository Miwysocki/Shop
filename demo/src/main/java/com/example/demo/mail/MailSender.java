
package com.example.demo.mail;

import com.example.demo.Product.Product;
import com.example.demo.customer.Customer;
import com.example.demo.order.Orders;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.List;
import java.util.Properties;

public class MailSender {

    public JavaMailSender getJavaMailSender(){
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();

        mailSender.setHost("smtp.gmail.com");
        mailSender.setPort(587);

        mailSender.setUsername("smtp.aspmvc.projekt@gmail.com");
        mailSender.setPassword("x%^zucywa,Ya");

        Properties properties = mailSender.getJavaMailProperties();
        properties.put("mail.transport.protocol","smtp");
        properties.put("mail.smth.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.debug","true");

        return mailSender;
    }

    public void sendSimpleMessage(String toEmail, String Subject, String Message){
        SimpleMailMessage sms = new SimpleMailMessage();
        sms.setFrom("smtp.aspmvc.projekt@gmail.com");
        sms.setTo(toEmail);
        sms.setSubject(Subject);
        sms.setText(Message);
        this.getJavaMailSender().send(sms);
    }

    public void sendOrderMessage(Orders order){
        sendSimpleMessage(order.getCustomer().getEmail(),
                "Your new order",
                createOrderMessage(order));
    }

    private String createOrderMessage(Orders order){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Order #");
        stringBuilder.append(order.getId());
        stringBuilder.append(" made successfully!");
        stringBuilder.append("\n");
        stringBuilder.append("Your order: \n\n");
        stringBuilder.append("ID");
        stringBuilder.append("\t");
        stringBuilder.append("Product name");
        stringBuilder.append("\t");
        stringBuilder.append("Price");
        stringBuilder.append("\n");
        List<Product> orderedProducts = order.getProducts();
        for(int i=0;i<orderedProducts.size();i++){
            stringBuilder.append(orderedProducts.get(i).getId());
            stringBuilder.append("\t");
            stringBuilder.append(orderedProducts.get(i).getName());
            stringBuilder.append("\t");
            stringBuilder.append(orderedProducts.get(i).getPrice());
            stringBuilder.append("\n");
        }
        stringBuilder.append("\n Thanks for shopping!");
        return stringBuilder.toString();
    }

}