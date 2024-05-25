package com.j2eeapi.com.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idOrder;
    private Date dateOrder;
    private String etatCommande;
    @ManyToOne
    @JoinColumn(name = "idUtilisateur")
    private User idUtilisateur;

    @OneToMany
    @JoinColumn(name = "ticket")
    private List<Ticket> tickets;

    public Orders(){

    }

    public Orders(Long idOrder, Date dateOrder, String etatCommande, User idUtilisateur, List<Ticket> tickets) {
        this.idOrder = idOrder;
        this.dateOrder = dateOrder;
        this.etatCommande = etatCommande;
        this.idUtilisateur = idUtilisateur;
        this.tickets = tickets;
    }

    public Long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
    }

    public Date getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(Date dateOrder) {
        this.dateOrder = dateOrder;
    }

    public String getEtatCommande() {
        return etatCommande;
    }

    public void setEtatCommande(String etatCommande) {
        this.etatCommande = etatCommande;
    }

    public User getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(User idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
}
