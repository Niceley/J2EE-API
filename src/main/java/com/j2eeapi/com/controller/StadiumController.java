package com.j2eeapi.com.controller;

import com.j2eeapi.com.dto.CreateStadiumDto;
import com.j2eeapi.com.dto.UpdateStadiumDto;
import com.j2eeapi.com.model.Stadium;
import com.j2eeapi.com.service.StadiumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stadiums")
public class StadiumController {

    @Autowired
    private StadiumService stadiumService;

    @PostMapping("/create")
    public ResponseEntity<Stadium> createStadium(@RequestBody CreateStadiumDto CreateStadiumDto) {
        try {
            return stadiumService.createStadium(CreateStadiumDto);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Stadium> getStadium(@PathVariable Long id) {
        try {
            return stadiumService.getStadium(id);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/all")
    public ResponseEntity<List<Stadium>> getAllStadiums() {
        try {
            return stadiumService.getAllStadiums();
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Stadium> updateStadium(@PathVariable Long id, @RequestBody UpdateStadiumDto UpdateStadiumDto) {
        try {
            return stadiumService.updateStadium(id, UpdateStadiumDto);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStadium(@PathVariable Long id) {
        try {
            return stadiumService.deleteStadium(id);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
