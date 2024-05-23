package com.j2eeapi.com.model;

import jakarta.persistence.*;

@Entity
public class Stadium {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idStadium;
    private String name;
    private int CapaciteStade;

    public String getName() {
        return name;
    }

    public int getCapaciteStade() {
        return CapaciteStade;
    }

    public Long getIdStadium() {
        return idStadium;
    }

    public void setIdStadium(Long idStadium) {
        this.idStadium = idStadium;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapaciteStade(int capaciteStade) {
        CapaciteStade = capaciteStade;
    }
}