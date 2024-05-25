package com.j2eeapi.com.model;

import jakarta.persistence.*;

import java.util.Date;


@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEvent;
    private String name;
    private Date dateTime;
    private String StatutEpreuve;
    @ManyToOne
    @JoinColumn(name = "Stade")
    private Stadium Stade;

    public Event() {
    }

    public Event(Long idEvent, String name, Date dateTime, String statutEpreuve, Stadium Stade) {
        this.idEvent = idEvent;
        this.name = name;
        this.dateTime = dateTime;
        StatutEpreuve = statutEpreuve;
        this.Stade = Stade;
    }

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

    public Stadium getStade() {
        return Stade;
    }

    public void setStade(Stadium stade) {
        this.Stade = stade;
    }
}