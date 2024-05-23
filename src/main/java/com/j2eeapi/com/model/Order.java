package com.j2eeapi.com.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idOrder;
    private Date dateOrder;
    private String etatCommande;
    @ManyToOne
    @JoinColumn(name = "idUtilisateur")
    private User idUtilisateur;

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
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
}
