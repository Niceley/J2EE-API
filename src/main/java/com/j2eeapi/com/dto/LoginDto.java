package com.j2eeapi.com.dto;

public class LoginDto {
    private Long IdUtilisateur;
    private String Motdepasse;

    public LoginDto(Long idUtilisateur, String motdepasse) {
        IdUtilisateur = idUtilisateur;
        Motdepasse = motdepasse;
    }

    public Long getIdUtilisateur() {
        return IdUtilisateur;
    }

    public void setIdUtilisateur(Long idUtilisateur) {
        IdUtilisateur = idUtilisateur;
    }

    public String getMotdepasse() {
        return Motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        Motdepasse = motdepasse;
    }
}
