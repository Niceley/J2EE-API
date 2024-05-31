package com.j2eeapi.com.dto;

public class LoginDto {
    private String email;
    private String Motdepasse;

    public LoginDto(String email, String motdepasse) {
        this.email = email;
        Motdepasse = motdepasse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotdepasse() {
        return Motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        Motdepasse = motdepasse;
    }
}
