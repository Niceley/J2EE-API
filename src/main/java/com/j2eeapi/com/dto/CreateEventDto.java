package com.j2eeapi.com.dto;

import com.j2eeapi.com.model.Stadium;
import jakarta.persistence.*;

import java.time.LocalDateTime;

public class CreateEventDto {

    private Long id;
    private String name;
    private LocalDateTime dateTime;
    private String StatutEpreuve;
    private Stadium idStade;

    public CreateEventDto(Long id, Stadium idStade, String statutEpreuve, LocalDateTime dateTime, String name) {
        this.id = id;
        this.idStade = idStade;
        StatutEpreuve = statutEpreuve;
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

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
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
}
