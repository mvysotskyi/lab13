package com.lab.task2;

public class Database extends БазаДаних {
    public String receiveUserData() {
        return отриматиДаніКористувача();
    }
    
    public String receiveStaticData() {
        return отриматиСтатистичніДані();
    } 
}