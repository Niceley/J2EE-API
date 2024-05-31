package com.j2eeapi.com.dto;

public class CreateUserDto {

    private Long IdUtilisateur;
    private String Motdepasse;
    private String Nom;
    private String Prenom;
    private String Numero;
    private String email;


    public CreateUserDto(Long idUtilisateur, String motdepasse, String nom, String prenom, String numero, String email) {
        IdUtilisateur = idUtilisateur;
        Motdepasse = motdepasse;
        Nom = nom;
        Prenom = prenom;
        Numero = numero;
        this.email = email;
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

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
