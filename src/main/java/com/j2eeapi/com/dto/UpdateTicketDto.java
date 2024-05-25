package com.j2eeapi.com.dto;

import com.j2eeapi.com.model.Event;
import com.j2eeapi.com.model.Orders;
import com.j2eeapi.com.model.User;
import jakarta.persistence.*;

public class UpdateTicketDto {
    private Long id;
    private int price;
    private Event idEvent;
    private Orders idOrder;
    private User UtilisateurInscrit;

    public UpdateTicketDto(Long id, int price, Event idEvent, Orders idOrder, User utilisateurInscrit) {
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

    public Orders getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Orders idOrder) {
        this.idOrder = idOrder;
    }

    public User getUtilisateurInscrit() {
        return UtilisateurInscrit;
    }

    public void setUtilisateurInscrit(User utilisateurInscrit) {
        UtilisateurInscrit = utilisateurInscrit;
    }
}
