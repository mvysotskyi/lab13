package com.lab.task2;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Auth auth = new Auth();
        if (auth.auth(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
