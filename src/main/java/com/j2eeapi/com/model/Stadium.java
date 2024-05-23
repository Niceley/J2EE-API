package com.j2eeapi.com.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Stadium {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int CapaciteStade;

    public String getName() {
        return name;
    }

    public int getCapaciteStade() {
        return CapaciteStade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapaciteStade(int capaciteStade) {
        CapaciteStade = capaciteStade;
    }
}