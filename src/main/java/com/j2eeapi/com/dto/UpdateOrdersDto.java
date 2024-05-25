package com.j2eeapi.com.dto;

import com.j2eeapi.com.model.User;

import java.util.Date;

public class UpdateOrdersDto {

    private Long idOrder;
    private Date dateOrder;
    private String etatCommande;
    private User idUtilisateur;

    public UpdateOrdersDto(Long idOrder, User idUtilisateur, String etatCommande, Date dateOrder) {
        this.idOrder = idOrder;
        this.idUtilisateur = idUtilisateur;
        this.etatCommande = etatCommande;
        this.dateOrder = dateOrder;
    }

    public Long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
    }

    public User getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(User idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getEtatCommande() {
        return etatCommande;
    }

    public void setEtatCommande(String etatCommande) {
        this.etatCommande = etatCommande;
    }

    public Date getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(Date dateOrder) {
        this.dateOrder = dateOrder;
    }
}
