package org.learn.rest.model;

import java.util.Date;

public class Profile {


    private long id;
    private String ProfileName;
    private String Fname;
    private String Lname;
    private Date createdat;




public Profile(long id , String ProfileName , String Fname , String Lname){
    this.id=id;
    this.ProfileName=ProfileName;
    this.Fname=Fname;
    this.Lname=Lname;
    this.createdat=new Date();

   }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProfileName() {
        return ProfileName;
    }

    public void setProfileName(String profileName) {
        ProfileName = profileName;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }
}