package com.j2eeapi.com.service;

import com.j2eeapi.com.dto.CreateOrderDto;
import com.j2eeapi.com.dto.UpdateOrdersDto;
import com.j2eeapi.com.model.Orders;
import com.j2eeapi.com.model.Ticket;
import com.j2eeapi.com.repository.OrderRepository;
import com.j2eeapi.com.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    private final OrderRepository repository;
    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public ResponseEntity<Orders> createOrder(CreateOrderDto orders){
        List<Ticket> tickets = orders.getTickets();
        List<Ticket> savedTickets = new ArrayList<>();
        for (Ticket ticket : tickets) {
            Ticket savedTicket = this.ticketRepository.save(ticket);
            savedTickets.add(savedTicket);
        }
        Orders order = new Orders(orders.getIdOrder(),
                      orders.getDateOrder(),
                      orders.getEtatCommande(),
                      orders.getIdUtilisateur(),
                      savedTickets
                        );
        order = repository.save(order);
        return new ResponseEntity<>(order, HttpStatus.CREATED);
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
