package com.j2eeapi.com.service;

import com.j2eeapi.com.dto.CreateEventDto;
import com.j2eeapi.com.dto.UpdateEventDto;
import com.j2eeapi.com.model.Event;
import com.j2eeapi.com.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    private final EventRepository repository;

    @Autowired
    public EventService(EventRepository repository){ this.repository = repository;}

    public ResponseEntity<Event> createEvent(CreateEventDto createEventDto){
        Event event = new Event(createEventDto.getId(),
                createEventDto.getName(),
                createEventDto.getDateTime(),
                createEventDto.getStatutEpreuve(),
                createEventDto.getStade());
        event = repository.save(event);
        return new ResponseEntity<>(event, HttpStatus.CREATED);
    }

    public ResponseEntity<Event> getEvent(Long id) {
        Event event = this.repository.findById(id).orElse(null);
        return new ResponseEntity<>(event, HttpStatus.OK);
    }

    public ResponseEntity<List<Event>> getAllEvents() {
        List<Event> events = this.repository.findAll();
        return new ResponseEntity<>(events, HttpStatus.OK);
    }

    public ResponseEntity<Event> updateEvent(Long idEvent, UpdateEventDto updateEventDto) {
    Event event = this.repository.findById(idEvent).orElseThrow( ()
            -> new RuntimeException("Evenement non disponible"));

    event.setName(updateEventDto.getName());
    event.setDateTime(updateEventDto.getDateTime());
    event.setStatutEpreuve(updateEventDto.getStatutEpreuve());
    event.setStade(updateEventDto.getIdStade());
    event = this.repository.save(event);
    return new ResponseEntity<>(event, HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteEvent(Long id) {
        this.repository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
