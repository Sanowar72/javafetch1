package com.example.RandomJokesNew;

import lombok.SneakyThrows;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
public class RandomJokesNew {
    @SneakyThrows
    public static void main(String[] args) {
       try {
            // Create a URL object with the API endpoint
            URL url = new URL("https://api.zippopotam.us/us/33162");
            
            // Open a connection to the URL
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            
            // Get the response code
            int responseCode = conn.getResponseCode();
            
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Create a BufferedReader to read the API response
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();
                
                // Read the response line by line
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                
                // Print the JSON response
                System.out.println(response.toString());
            } else {
                System.out.println("Error: " + responseCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
