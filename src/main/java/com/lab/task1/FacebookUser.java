package com.lab.task1;

import java.util.Date;


public class FacebookUser {
    private String email;
    private String userCountry;
    private Date userActiveTime;

    public FacebookUser(String email, String userCountry, Date userActiveTime) {
        this.email = email;
        this.userCountry = userCountry;
        this.userActiveTime = userActiveTime;
    }

    public String getEmail() {
        return email;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public Date getUserActiveTime() {
        return userActiveTime;
    }
}