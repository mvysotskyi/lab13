package com.lab.task1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        TwitterUser twUser = new TwitterUser(
            "twitter@example.com", "Tadzjikistan", new Date());
        FacebookUser fbUser = new FacebookUser(
            "facebook@example.com", "Kazakhstan", new Date());

        MessageSender messageSender = new MessageSender();

        // Using TwitterUser with the MessageSender
        MessageSender.UserAdapter twAdapter = new TwitterUserAdapter(twUser);
        messageSender.send("Hello Twitter User!", twAdapter, "Tadzjikistan");

        // Using FacebookUser with the MessageSender
        MessageSender.UserAdapter fbAdapter = new FacebookUserAdapter(fbUser);
        messageSender.send("Hello Facebook User!", fbAdapter, "Kazakhstan");
    }
}