package com.j2eeapi.com.service;

import com.j2eeapi.com.model.Event;
import com.j2eeapi.com.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    private final EventRepository repository;

    @Autowired
    public EventService(EventRepository repository){ this.repository = repository;}

    public Event createEvent(Event event){
        return repository.save(event);
    }

    public Event getEvent(Long id) {
        return this.repository.findById(id).orElse(null);
    }

    public List<Event> getAllEvent() {
        return this.repository.findAll();
    }

    public Event updateEvent(Event event) {
        return this.repository.save(event);
    }

    public void deleteEvent(Long id) {
        this.repository.deleteById(id);
    }

}
