package com.j2eeapi.com.model;

import jakarta.persistence.*;

@Entity
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IdUtilisateur;
    private String Motdepasse;
    private String Nom;
    private String Prenom;
    private String Numero;
    private String Mail;
    private String RoleUtilisateur;

    public User() {
    }

    public User(Long idUtilisateur, String motdepasse, String nom, String prenom, String numero, String mail, String roleUtilisateur) {
        this.IdUtilisateur = idUtilisateur;
        this.Motdepasse = motdepasse;
        this.Nom = nom;
        this.Prenom = prenom;
        this.Numero = numero;
        this.Mail = mail;
        this.RoleUtilisateur = roleUtilisateur;
    }

    public User(String utilisateur){

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

    public String getRoleUtilisateur() {
        return RoleUtilisateur;
    }

    public void setRoleUtilisateur(String roleUtilisateur) {
        RoleUtilisateur = roleUtilisateur;
    }
}