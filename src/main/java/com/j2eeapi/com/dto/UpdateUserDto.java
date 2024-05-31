package com.j2eeapi.com.dto;

public class UpdateUserDto {
    private Long IdUtilisateur;
    private String Motdepasse;
    private String Nom;
    private String Prenom;
    private String Numero;
    private String Mail;


    public UpdateUserDto(Long idUtilisateur, String motdepasse, String nom, String prenom, String numero, String mail) {
        IdUtilisateur = idUtilisateur;
        Motdepasse = motdepasse;
        Nom = nom;
        Prenom = prenom;
        Numero = numero;
        Mail = mail;
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

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

}
