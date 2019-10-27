package com.example.facultyfinderit;

public class user {
    private String emailid;
    private  String pss;

    public user(String emailid, String pss) {
        this.emailid = emailid;
        this.pss = pss;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getPss() {
        return pss;
    }

    public void setPss(String pss) {
        this.pss = pss;
    }

    public user() {

    }
}
