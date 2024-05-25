package com.j2eeapi.com.service;

import com.j2eeapi.com.dto.CreateStadiumDto;
import com.j2eeapi.com.dto.UpdateStadiumDto;
import com.j2eeapi.com.model.Stadium;
import com.j2eeapi.com.repository.EventRepository;
import com.j2eeapi.com.repository.StadiumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StadiumService {
    private final StadiumRepository repository;

    @Autowired
    public StadiumService(StadiumRepository repository) {
        this.repository = repository;
    }

    public ResponseEntity<Stadium> createStadium(CreateStadiumDto CreateStadiumDto){
        Stadium stadium = new Stadium(CreateStadiumDto.getId(),
                CreateStadiumDto.getName(),
                CreateStadiumDto.getCapaciteStade());
        stadium = repository.save(stadium);
        return new ResponseEntity<>(stadium, HttpStatus.CREATED);
    }

    public ResponseEntity<Stadium> getStadium(Long id) {
        Stadium stadium = this.repository.findById(id).orElse(null);
        return new ResponseEntity<>(stadium, HttpStatus.OK);
    }

    public ResponseEntity<List<Stadium>> getAllStadiums() {
        List<Stadium> stadiums = this.repository.findAll();
        return new ResponseEntity<>(stadiums, HttpStatus.OK);
    }

    public ResponseEntity<Stadium> updateStadium(Long idStadium, UpdateStadiumDto UpdateStadiumDto) {
        Stadium stadium = this.repository.findById(idStadium).orElseThrow( ()
                -> new RuntimeException("Stade introuvable"));

        stadium.setName(UpdateStadiumDto.getName());
        stadium.setCapaciteStade(UpdateStadiumDto.getCapaciteStade());
        stadium = this.repository.save(stadium);
        return new ResponseEntity<>(stadium, HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteStadium(Long id) {
        this.repository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
