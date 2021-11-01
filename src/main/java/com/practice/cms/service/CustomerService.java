package com.practice.cms.service;

import com.practice.cms.dao.CustomerDAO;
import com.practice.cms.exception.CustomerNotFoundException;
import com.practice.cms.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
//import java.util.concurrent.CopyOnWriteArrayList;
@Component
public class CustomerService {
    @Autowired
    private CustomerDAO customerdao;
//    private List<Customer> customerlist = new CopyOnWriteArrayList<>();

    public Customer addCustomer(Customer customer){
        return customerdao.save(customer);
    }

    public List<Customer> getCustomers() {
        return  customerdao.findAll();
    }

    public Customer getCustomer(int Customerid){
        Optional<Customer> optionalCustomer = customerdao.findById(Customerid);
        if(!optionalCustomer.isPresent())
            throw new CustomerNotFoundException("Customer not found in the database");
        return optionalCustomer.get();
    }

    public Customer UpdateCustomer(int CustomerId,Customer customer){
        customer.setId(CustomerId);
        return customerdao.save(customer);
    }


    public void deleteCustomer(int CustomerId){
        customerdao.deleteById(CustomerId);
    }
}
