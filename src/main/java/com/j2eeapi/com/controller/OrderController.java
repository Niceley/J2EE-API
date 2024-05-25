package com.j2eeapi.com.controller;

import com.j2eeapi.com.dto.CreateOrderDto;
import com.j2eeapi.com.dto.UpdateOrdersDto;
import com.j2eeapi.com.model.Orders;
import com.j2eeapi.com.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public ResponseEntity<Orders> createOrders(@RequestBody CreateOrderDto createOrderDto) {
        try {
            return orderService.createOrder(createOrderDto);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Orders> getOrders(@PathVariable Long id) {
        try {
            return orderService.getOrder(id);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/all")
    public ResponseEntity<List<Orders>> getAllOrders() {
        try {
            return orderService.getAllOrders();
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Orders> updateOrders(@PathVariable Long id, @RequestBody UpdateOrdersDto UpdateOrdersDto) {
        try {
            return orderService.updateOrder(id, UpdateOrdersDto);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrders(@PathVariable Long id) {
        try {
            return orderService.deleteOrder(id);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
