package com.gianna.demo3;
import com.gianna.demo3.carpentry_mis.Carpenters;
import com.gianna.demo3.carpentry_mis.CarpentersRepository;
import com.gianna.demo3.Store.Store;

import com.gianna.demo3.customer.Customers;

import com.gianna.demo3.furniture.Furniture;

import com.gianna.demo3.supplier.Supplier;

import com.gianna.demo3.carpentry_mis.CarpentersService;
import com.gianna.demo3.Store.StoreService;
import com.gianna.demo3.customer.CustomerService;
import com.gianna.demo3.furniture.FurnitureService;
import com.gianna.demo3.supplier.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;





@SpringBootApplication
public class Demo3Application{
    @Autowired
    private CarpentersService carpentersService;

    @Autowired
    private StoreService storeService;

    @Autowired
    private FurnitureService furnitureService;

    @Autowired
    private CustomerService customersService;

    @Autowired
    private SupplierService supplierService;

    public static void main(String[] args) {
        SpringApplication.run(Demo3Application.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(CarpentersRepository carpentersRepository) {
        return  args->{

            Carpenters carpenter= new Carpenters("Linda",30,"Rubavu");
            carpentersRepository.save(carpenter);
            Store store = new Store("Kirehe", 120, carpenter);
            storeService.saveStore(store);

            // Insert data into Furniture table
            Furniture furniture = new Furniture("blue", 100.0, carpenter, store);
            furnitureService.saveFurniture(furniture);

            // Insert data into Customers table
            Customers customer = new Customers("Jene", "Musanze", carpenter, furniture);
            customersService.saveCustomer(customer);

            // Insert data into Supplier table
            Supplier supplier = new Supplier("Gasabo", 250.0, new Date(), carpenter);
            supplierService.saveSupplier(supplier);
        };
        };

    }


