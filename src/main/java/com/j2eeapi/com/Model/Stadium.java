package com.j2eeapi.com.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "stadiums")
public class Stadium {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "stadium")
    private List<Event> events;

    // Getters

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Event> getEvents() {
        return events;
    }

    //Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public void setName(String name) {
        this.name = name;
    }
}