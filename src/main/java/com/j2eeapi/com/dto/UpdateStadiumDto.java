package com.j2eeapi.com.dto;

public class UpdateStadiumDto {

    private Long id;
    private String name;
    private int CapaciteStade;


    public UpdateStadiumDto(Long id, int capaciteStade, String name) {
        this.id = id;
        CapaciteStade = capaciteStade;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapaciteStade() {
        return CapaciteStade;
    }

    public void setCapaciteStade(int capaciteStade) {
        CapaciteStade = capaciteStade;
    }
}
