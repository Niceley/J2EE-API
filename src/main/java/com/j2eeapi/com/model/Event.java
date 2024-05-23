package com.j2eeapi.com.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
public class Event{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private LocalDateTime dateTime;
<<<<<<< Updated upstream
    private String stadium;
=======
    private String StatutEpreuve;
    @ManyToOne
    @JoinColumn(name = "id")
    private Stadium idStade;
>>>>>>> Stashed changes

    public Long getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getStatutEpreuve() {
        return StatutEpreuve;
    }

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

    public Stadium getIdStade() {
        return idStade;
    }

    public void setIdStade(Stadium idStade) {
        this.idStade = idStade;
    }
}