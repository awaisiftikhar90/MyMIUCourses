package com.example.asdfinalprojecteshop.service;

import edu.miu.eshop.DTO.OrderRequest;
import edu.miu.eshop.model.Order;

import java.util.List;

public interface OrderService {

    List<Order> getOrders(Long customerId);
    Order addOrder(OrderRequest request);
}
