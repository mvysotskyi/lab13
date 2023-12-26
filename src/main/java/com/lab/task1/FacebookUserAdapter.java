package com.lab.task1;

import java.util.Date;


public class FacebookUserAdapter implements MessageSender.UserAdapter {
    private FacebookUser facebookUser;

    public FacebookUserAdapter(FacebookUser facebookUser) {
        this.facebookUser = facebookUser;
    }

    @Override
    public String getEmail() {
        return facebookUser.getEmail();
    }

    @Override
    public String getUserCountry() {
        return facebookUser.getUserCountry();
    }

    @Override
    public Date getUserActiveTime() {
        return facebookUser.getUserActiveTime();
    }
}