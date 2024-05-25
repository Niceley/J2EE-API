package com.j2eeapi.com.dto;

import com.j2eeapi.com.model.Stadium;

import java.util.Date;

public class CreateEventDto {

    private Long id;
    private String name;
    private Date dateTime;
    private String StatutEpreuve;
    private Stadium Stade;

    public CreateEventDto(Long id, Stadium Stade, String statutEpreuve, Date dateTime, String name) {
        this.id = id;
        this.Stade = Stade;
        this.StatutEpreuve = statutEpreuve;
        this.dateTime = dateTime;
        this.name = name;
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

    public Stadium getStade() {
        return Stade;
    }

    public void setStade(Stadium stade) {
        this.Stade = stade;
    }

    public String getStatutEpreuve() {
        return StatutEpreuve;
    }

    public void setStatutEpreuve(String statutEpreuve) {
        StatutEpreuve = statutEpreuve;
    }
}
