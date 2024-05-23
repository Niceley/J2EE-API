package com.j2eeapi.com.dto;

import com.j2eeapi.com.model.Event;
import com.j2eeapi.com.model.Order;
import com.j2eeapi.com.model.User;
import jakarta.persistence.*;

public class CreateTicketDto {
    private Long id;
    private int price;
    private Event idEvent;
    private Order idOrder;
    private User UtilisateurInscrit;

    public CreateTicketDto(Long id, int price, Event idEvent, Order idOrder, User utilisateurInscrit) {
        this.id = id;
        this.price = price;
        this.idEvent = idEvent;
        this.idOrder = idOrder;
        UtilisateurInscrit = utilisateurInscrit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Event getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(Event idEvent) {
        this.idEvent = idEvent;
    }

    public Order getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Order idOrder) {
        this.idOrder = idOrder;
    }

    public User getUtilisateurInscrit() {
        return UtilisateurInscrit;
    }

    public void setUtilisateurInscrit(User utilisateurInscrit) {
        UtilisateurInscrit = utilisateurInscrit;
    }
}
