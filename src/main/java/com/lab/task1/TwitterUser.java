package com.lab.task1;

import java.util.Date;


public class TwitterUser {
    private String userMail;
    private String country;
    private Date lastActiveTime;

    public TwitterUser(String userMail, String country, Date lastActiveTime) {
        this.userMail = userMail;
        this.country = country;
        this.lastActiveTime = lastActiveTime;
    }

    public String getUserMail() {
        return userMail;
    }

    public String getCountry() {
        return country;
    }

    public Date getLastActiveTime() {
        return lastActiveTime;
    }
}