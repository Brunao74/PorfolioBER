package com.porfolioBER.BER.DTO;

public class DTORedes {

    private String Facebook;
    private String Github;
    private String Email;
    private String Linkedin;

    public DTORedes() {
    }

    public DTORedes(String Facebook, String Github, String Email, String Linkedin) {
        this.Facebook = Facebook;
        this.Github = Github;
        this.Email = Email;
        this.Linkedin = Linkedin;
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
