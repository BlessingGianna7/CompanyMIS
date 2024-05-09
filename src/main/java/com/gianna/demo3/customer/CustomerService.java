package com.gianna.demo3.customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomersRepository customersRepository;

    public List<Customers> getAllCustomers() {
        return customersRepository.findAll();
    }

    public Customers getCustomerById(Long id) {
        return customersRepository.findById(id).orElse(null);
    }

    public Customers saveCustomer(Customers customer) {
        return customersRepository.save(customer);
    }

    public void deleteCustomer(Long id) {
        customersRepository.deleteById(id);
    }
}
