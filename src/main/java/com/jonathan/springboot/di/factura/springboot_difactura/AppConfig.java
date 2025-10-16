package com.jonathan.springboot.di.factura.springboot_difactura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.jonathan.springboot.di.factura.springboot_difactura.models.Item;
import com.jonathan.springboot.di.factura.springboot_difactura.models.Product;

@Configuration
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
public class AppConfig {

    @Bean
    @Primary
    List<Item> itemsInvoice() {
        return Arrays.asList(
                new Item(new Product("Camera", 250), 2),
                new Item(new Product("Playstation 5", 350), 4));
    }

    @Bean("officeInvoice")
    List<Item> itemsInvoiceOffice() {
        return Arrays.asList(
                new Item(new Product("Office computer", 400), 4),
                new Item(new Product("Printer", 200), 1),
                new Item(new Product("Notebook", 320), 4),
                new Item(new Product("Paper box", 10), 20));
    }
}
