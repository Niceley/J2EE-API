package com.j2eeapi.com.model;

import jakarta.persistence.*;

import java.util.Date;


@Entity
public class Event{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEvent;
    private String name;
    private Date dateTime;
    private String StatutEpreuve;
    @ManyToOne
    @JoinColumn(name = "idStade")
    private Stadium idStade;

    public Long getIdEvent() {
        return idEvent;
    }

    public String getName(){
        return name;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public String getStatutEpreuve() {
        return StatutEpreuve;
    }

    public void setStatutEpreuve(String statutEpreuve) {
        StatutEpreuve = statutEpreuve;
    }

    public void setIdEvent(Long idEvent) {
        this.idEvent = idEvent;
    }

    public void setName(String name) {
        this.name = name;
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
}