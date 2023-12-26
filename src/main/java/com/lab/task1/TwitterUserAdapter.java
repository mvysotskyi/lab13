package com.lab.task1;

import java.util.Date;


public class TwitterUserAdapter implements MessageSender.UserAdapter {
    private TwitterUser twitterUser;

    public TwitterUserAdapter(TwitterUser twitterUser) {
        this.twitterUser = twitterUser;
    }

    @Override
    public String getEmail() {
        return twitterUser.getUserMail();
    }

    @Override
    public String getUserCountry() {
        return twitterUser.getCountry();
    }

    @Override
    public Date getUserActiveTime() {
        return twitterUser.getLastActiveTime();
    }
}
