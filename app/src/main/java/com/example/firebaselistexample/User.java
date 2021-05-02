package com.example.firebaselistexample;

public class User {
    private String profile;
    private String id;
    private int stdNum;
    private String userName;


    public User(){}
    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStdNum() {
        return stdNum;
    }

    public void setPw(int stdNum) {
        this.stdNum = stdNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


}
