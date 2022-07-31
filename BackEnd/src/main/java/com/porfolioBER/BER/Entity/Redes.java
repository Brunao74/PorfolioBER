package com.porfolioBER.BER.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Redes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Facebook;
    private String Github;
    private String Email;
    private String Linkedin;

    public Redes() {
    }

    public Redes(String Facebook, String Github, String Email, String Linkedin) {
        this.Facebook = Facebook;
        this.Github = Github;
        this.Email = Email;
        this.Linkedin = Linkedin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFacebook() {
        return Facebook;
    }

    public void setFacebook(String Facebook) {
        this.Facebook = Facebook;
    }

    public String getGithub() {
        return Github;
    }

    public void setGithub(String Github) {
        this.Github = Github;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getLinkedin() {
        return Linkedin;
    }

    public void setLinkedin(String Linkedin) {
        this.Linkedin = Linkedin;
    }

}
