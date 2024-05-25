package com.j2eeapi.com.service;

import com.j2eeapi.com.model.Orders;
import com.j2eeapi.com.repository.OrderRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {

    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public Orders createOrder(Orders order){
        return repository.save(order);
    }

    public Orders getOrders(Long id) {
        return this.repository.findById(id).orElse(null);
    }

    public List<Orders> getAllOrders() {
        return this.repository.findAll();
    }

    public Orders updateOrder(Orders order) {
        return this.repository.save(order);
    }

    public void deleteOrder(Long id) {
        this.repository.deleteById(id);
    }



}
