package com.raiseup.microservices.orderservice.service;

import com.raiseup.microservices.orderservice.model.Order;
import com.raiseup.microservices.orderservice.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order create(Order order) {
        return orderRepository.save(order);
    }
}
