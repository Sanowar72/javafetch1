package com.geekster.java1;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@SpringBootApplication
public class Java1Application {

	public static void main(String[] args) throws Exception {

		URL getUrl = new URL("https://api.zippopotam.us/us/33162");
		HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();
		connection.setRequestMethod("GET");

		int responseCode = connection.getResponseCode();

		if (responseCode == 200) {

			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuilder jsonResponseData = new StringBuilder();
			String readLine = null;

			while ((readLine = in.readLine()) != null) {
				jsonResponseData.append(readLine);
			}

			in.close();
			JSONObject masterData = new JSONObject(jsonResponseData.toString());

			System.out.println("Current country :- " + masterData.get("country"));

			// System.out.println("Current generationtime_ms " +
			// masterData.get("generationtime_ms"));
			//
			// JSONObject currentWeatherObj = (JSONObject)
			// masterData.get("current_weather");
			//
			// System.out.println("Current temperature " +
			// currentWeatherObj.get("temperature"));
			// System.out.println("Current windspeed " +
			// currentWeatherObj.get("windspeed"));
			System.out.println(masterData);

			System.out.println("i'm running");
		} else {
			System.out.println("This is not valid URL- " + responseCode);
		}

	}

}
