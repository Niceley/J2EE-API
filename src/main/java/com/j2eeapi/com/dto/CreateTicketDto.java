package com.j2eeapi.com.dto;

import com.j2eeapi.com.model.Event;
import com.j2eeapi.com.model.Orders;
import com.j2eeapi.com.model.Ticket;
import com.j2eeapi.com.model.User;
import jakarta.persistence.*;

import java.util.List;

public class CreateTicketDto {
    private Long id;
    private int price;
    private Event idEvent;
    private User UtilisateurInscrit;
    private List<Ticket> tickets;

    public CreateTicketDto(Long id, int price, Event idEvent, Orders idOrder, User utilisateurInscrit, List<Ticket> tickets) {
        this.id = id;
        this.price = price;
        this.idEvent = idEvent;
        this.UtilisateurInscrit = utilisateurInscrit;
        this.tickets = tickets;
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

    public User getUtilisateurInscrit() {
        return UtilisateurInscrit;
    }

    public void setUtilisateurInscrit(User utilisateurInscrit) {
        UtilisateurInscrit = utilisateurInscrit;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
}
