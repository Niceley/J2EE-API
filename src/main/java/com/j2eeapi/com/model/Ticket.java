package com.j2eeapi.com.model;

import jakarta.persistence.*;

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
    @JoinColumn(name = "utilisateurInscrit")
    private User utilisateurInscrit;

    public Ticket(){

    }
  
    public Ticket(Long idTicket, int price, Event idEvent, User utilisateurInscrit) {
        this.idTicket = idTicket;
        this.price = price;
        this.idEvent = idEvent;
        this.utilisateurInscrit = utilisateurInscrit;
    }

    ;
    public int getPrice() {
        return price;
    }

    public Event getIdEvent() {
        return idEvent;
    }


    public void setPrice(int price) {
        this.price = price;
    }

    public User getUtilisateurInscrit() {
        return utilisateurInscrit;
    }

    public void setIdTicket(Long idTicket) {
        this.idTicket = idTicket;
    }

    public void setUtilisateurInscrit(User utilisateurInscrit) {
        this.utilisateurInscrit = utilisateurInscrit;
    }

    public Long getIdTicket() {
        return idTicket;
    }

    public void setIdEvent(Event idEvent) {
        this.idEvent = idEvent;
    }

}