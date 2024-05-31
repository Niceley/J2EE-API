package com.j2eeapi.com.model;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IdUtilisateur;
    private String Motdepasse;
    private String Nom;
    private String Prenom;
    private String Numero;
    private String email;


    public User() {
    }

    public User(Long idUtilisateur, String motdepasse, String nom, String prenom, String numero, String email) {
        this.IdUtilisateur = idUtilisateur;
        this.Motdepasse = motdepasse;
        this.Nom = nom;
        this.Prenom = prenom;
        this.Numero = numero;
        this.email = email;
    }

    public User(String utilisateur) {

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

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getPassword() {
        return Motdepasse;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}