package com.j2eeapi.com.model;

import jakarta.persistence.*;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int price;

    @ManyToOne
    @JoinColumn(name = "id")
    private Event idEvent;

    @ManyToOne
    @JoinColumn(name = "idOrder")
    private Order idOrder;

    @ManyToOne
    @JoinColumn(name = "idUtilisateur")
    private User UtilisateurInscrit;
;
    public int getPrice() {
        return price;
    }

    public Event getIdEvent() {
        return idEvent;
    }

    public Order getIdOrder() {
        return idOrder;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public User getUtilisateurInscrit() {
        return UtilisateurInscrit;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUtilisateurInscrit(User utilisateurInscrit) {
        UtilisateurInscrit = utilisateurInscrit;
    }

    public Long getId() {
        return id;
    }

    public void setIdEvent(Event idEvent) {
        this.idEvent = idEvent;
    }

    public void setIdOrder(Order idOrder) {
        this.idOrder = idOrder;
    }
}