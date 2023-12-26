package com.lab.task3;

import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class PDLReader {
    public static void main(String[] args) throws IOException {
        String apiKey = "pass your api key";
        URL url = new URL(
            "https://api.peopledatalabs.com/v5/company/enrich?website=x.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");
        connection.setRequestProperty("X-Api-Key", apiKey);
        connection.connect();

        String text;
        try (Scanner SC = new Scanner(connection.getInputStream())) {
            text = SC.useDelimiter("\\Z").next();
        }

        JSONObject jsonObject = new JSONObject(text);
        
        Company company = new Company(
            jsonObject.getString("name"), 
            jsonObject.getString("description"), 
            jsonObject.getString("logo")
        );

        System.out.println(company);
    }
}
