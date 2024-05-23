package com.j2eeapi.com.service;

import com.j2eeapi.com.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    private final EventRepository repository;

    @Autowired
    public EventService(EventRepository repository){ this.repository = repository;}


}
