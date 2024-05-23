package com.j2eeapi.com.dto;

public class CreateUserDto {

    private Integer IdUtilisateur;
    private String Motdepasse;
    private String Nom;
    private String Prenom;
    private String Numero;
    private String Mail;
    private String RoleUtilisateur;


    public CreateUserDto(Integer idUtilisateur, String motdepasse, String nom, String prenom, String numero, String mail, String roleUtilisateur) {
        IdUtilisateur = idUtilisateur;
        Motdepasse = motdepasse;
        Nom = nom;
        Prenom = prenom;
        Numero = numero;
        Mail = mail;
        RoleUtilisateur = roleUtilisateur;
    }

    public Integer getIdUtilisateur() {
        return IdUtilisateur;
    }

    public void setIdUtilisateur(Integer idUtilisateur) {
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

    public String getRoleUtilisateur() {
        return RoleUtilisateur;
    }

    public void setRoleUtilisateur(String roleUtilisateur) {
        RoleUtilisateur = roleUtilisateur;
    }
}
