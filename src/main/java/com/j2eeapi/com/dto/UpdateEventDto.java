package com.j2eeapi.com.dto;

import com.j2eeapi.com.model.Stadium;

import java.time.LocalDateTime;
import java.util.Date;

public class UpdateEventDto {

    private Long id;
    private String name;
    private Date dateTime;
    private String StatutEpreuve;
    private Stadium idStade;
    private boolean estReservable;

    public UpdateEventDto(Long id, Stadium idStade, String statutEpreuve, Date dateTime, String name, boolean estReservable) {
        this.id = id;
        this.idStade = idStade;
        StatutEpreuve = statutEpreuve;
        this.dateTime = dateTime;
        this.name = name;
        this.estReservable = estReservable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Stadium getIdStade() {
        return idStade;
    }

    public void setIdStade(Stadium idStade) {
        this.idStade = idStade;
    }

    public String getStatutEpreuve() {
        return StatutEpreuve;
    }

    public void setStatutEpreuve(String statutEpreuve) {
        StatutEpreuve = statutEpreuve;
    }

    public boolean isEstReservable() {
        return estReservable;
    }

    public void setEstReservable(boolean estReservable) {
        this.estReservable = estReservable;
    }
}
