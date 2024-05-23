package com.j2eeapi.com.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idBillet;
    private int PrixBillet;

    public int getIdBillet() {
        return idBillet;
    }

    public int getPrixBillet() {
        return PrixBillet;
    }

    public void setPrixBillet(int prixBillet) {
        PrixBillet = prixBillet;
    }

    public void setIdBillet(int idBillet) {
        this.idBillet = idBillet;
    }

}