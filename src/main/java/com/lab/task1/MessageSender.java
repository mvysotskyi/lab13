package com.lab.task1;

import java.util.Date;


public class MessageSender {
    public interface UserAdapter {
        String getEmail();
        String getUserCountry();
        Date getUserActiveTime();
    }

    public void send(String text, UserAdapter user, String country) {
        if (user.getUserCountry().equalsIgnoreCase(country)) {
            Date currentTime = new Date();
            Date nextHour = new Date(currentTime.getTime() + 3600000);

            if (user.getUserActiveTime().before(nextHour)) {
                System.out.println("Sending message: " + text 
                + " to user with email: " + user.getEmail());
            }
        }
    }
}