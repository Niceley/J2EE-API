package com.j2eeapi.com.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTicket;
    private int price;

    @ManyToOne
    @JoinColumn(name = "idEvent")
    private Event idEvent;

    @ManyToOne
    @JoinColumn(name = "idOrder")
    private Orders idOrders;

    @ManyToOne
    @JoinColumn(name = "idUtilisateurInscrit")
    private User UtilisateurInscrit;

    @ManyToMany(mappedBy = "tickets")
    private List<Orders> orders;

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    public Orders getIdOrders() {
        return idOrders;
    }

    public void setIdOrders(Orders idOrders) {
        this.idOrders = idOrders;
    }

    public Ticket() {
    }

    public Ticket(Long idTicket, int price, Event idEvent, Orders idOrders, User utilisateurInscrit) {
        this.idTicket = idTicket;
        this.price = price;
        this.idEvent = idEvent;
        this.idOrders = idOrders;
        UtilisateurInscrit = utilisateurInscrit;
    }

    ;
    public int getPrice() {
        return price;
    }

    public Event getIdEvent() {
        return idEvent;
    }

    public Orders getIdOrder() {
        return idOrders;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public User getUtilisateurInscrit() {
        return UtilisateurInscrit;
    }

    public void setIdTicket(Long idTicket) {
        this.idTicket = idTicket;
    }

    public void setUtilisateurInscrit(User utilisateurInscrit) {
        UtilisateurInscrit = utilisateurInscrit;
    }

    public Long getIdTicket() {
        return idTicket;
    }

    public void setIdEvent(Event idEvent) {
        this.idEvent = idEvent;
    }

    public void setIdOrder(Orders idOrders) {
        this.idOrders = idOrders;
    }
}