package com.example.asdfinalprojecteshop.repository;

import edu.miu.eshop.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findCustomerByEmailAndPassword(String email,String password);
}
