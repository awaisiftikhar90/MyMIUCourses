package com.example.asdfinalprojecteshop.controller;

import edu.miu.eshop.DTO.LoginResponse;
import edu.miu.eshop.model.Customer;
import edu.miu.eshop.service.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping(value = {"api", "api/customers"})
public class CustomerController {

    private final CustomerService userService;

    public CustomerController(CustomerService userService) {
        this.userService = userService;
    }

    @PostMapping(value = {"/login"})
    public LoginResponse login(@RequestBody Customer user) {
        return userService.login(user.getEmail(), user.getPassword());
    }

    @PostMapping(value = {"/signup"})
    public Customer signup(@RequestBody Customer user) {
        return userService.signup(user);
    }
}
