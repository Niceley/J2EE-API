package com.j2eeapi.com.service;

import com.j2eeapi.com.dto.CreateOrderDto;
import com.j2eeapi.com.dto.UpdateOrdersDto;
import com.j2eeapi.com.model.Orders;
import com.j2eeapi.com.model.Ticket;
import com.j2eeapi.com.model.User;
import com.j2eeapi.com.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {

    private final OrderRepository repository;

    @Autowired
    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public ResponseEntity<Orders> createOrder(CreateOrderDto orders){
        Orders order = new Orders(orders.getIdOrder(),
                      orders.getDateOrder(),
                        orders.getEtatCommande(),
                        orders.getIdUtilisateur(),
                        orders.getTickets());
        order = repository.save(order);
        return new ResponseEntity<>(order, HttpStatus.CREATED);
    }

    public Orders buyTickets(User user, List<Ticket> tickets) {
        Orders order = new Orders();
        order.setIdUtilisateur(user);
        order.setTickets(tickets);
        return repository.save(order);
    }

    public ResponseEntity<Orders> getOrder(Long id) {
        Orders order = this.repository.findById(id).orElse(null);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    public ResponseEntity<List<Orders>> getAllOrders() {
        List<Orders> orders = this.repository.findAll();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    public ResponseEntity<Orders> updateOrder(Long idOrder, UpdateOrdersDto updateOrdersDto) {
        Orders order = this.repository.findById(idOrder).orElseThrow( ()
                -> new RuntimeException("Commande introuvable"));

        order.setDateOrder(updateOrdersDto.getDateOrder());
        order.setEtatCommande(updateOrdersDto.getEtatCommande());
        order.setIdUtilisateur(updateOrdersDto.getIdUtilisateur());
        order.setTickets(updateOrdersDto.getTickets());
        order = this.repository.save(order);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteOrder(Long id) {
        this.repository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
