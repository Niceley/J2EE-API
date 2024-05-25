package com.j2eeapi.com.service;

import com.j2eeapi.com.model.Stadium;
import com.j2eeapi.com.repository.StadiumRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StadiumService {
    private final StadiumRepository repository;

    public StadiumService(StadiumRepository repository) {
        this.repository = repository;
    }

    public Stadium createStadium(Stadium stadium){
        return repository.save(stadium);
    }

    public Stadium getStadium(Long id) {
        return this.repository.findById(id).orElse(null);
    }

    public Stadium updateStadium(Stadium stadium) {
        return this.repository.save(stadium);
    }

    public void deleteStadium(Long id) {
        this.repository.deleteById(id);
    }

    public List<Stadium> getAllStadium() {
        return this.repository.findAll();
    }



}
