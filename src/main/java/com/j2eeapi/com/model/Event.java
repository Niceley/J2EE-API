package com.j2eeapi.com.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "Events")
public class Event{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDateTime dateTime;
    private String stadium;

    // Getter
    public Long getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getStadium() {
        return stadium;
    }

    // Setter
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }
}