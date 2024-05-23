package com.j2eeapi.com.service;

import com.j2eeapi.com.repository.StadiumRepository;
import org.springframework.stereotype.Service;

@Service
public class StadiumService {
    private final StadiumRepository repository;

    public StadiumService(StadiumRepository repository) {
        this.repository = repository;
    }
}
