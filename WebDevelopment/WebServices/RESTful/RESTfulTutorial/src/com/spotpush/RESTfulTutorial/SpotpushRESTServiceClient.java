package com.spotpush.RESTfulTutorial;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import org.json.JSONObject;

public class SpotpushRESTServiceClient {

	public static void main(String[] args) {
		String string ="";
		try {
			//step 1 read file from the file system
			InputStream spotpushInputStream = new FileInputStream("C://JSONFiles/spotpushJSON.txt");
			InputStreamReader spotpushReader = new InputStreamReader(spotpushInputStream);
			BufferedReader br = new BufferedReader(spotpushReader);
			String line;
			while ((line = br.readLine()) != null) {
				string += line + "\n";
			}
			
			//convert the string to a JSON object
			JSONObject jsonObject = new JSONObject(string);
			System.out.println(jsonObject);
			
			//pass (JSON) file to REST service (spotpushService)
			try {
				//standard boilerplate code for connecting to a webservice/URL
				URL url = new URL("http://localhost:8182/RESTfulTutorial/api/spotpushService");
				URLConnection connection = url.openConnection(); //
				connection.setDoOutput(true); //use the URL for output the default is false
				connection.setRequestProperty("Content-Type", "application/json");
				connection.setConnectTimeout(5000);//milliseconds (5 seconds)
				connection.setReadTimeout(5000); //set a limit on receiving data once a connection is established
				OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
				out.write(jsonObject.toString());
				out.close();
				
				BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				
				while (in.readLine() != null) {
				}
				System.out.println("\nSpotpush REST Service Invoked Successfully...");
				in.close();
			} catch (Exception e) {
				System.out.println("\nError while caling Spotpush REST Service");
				System.out.println(e);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
