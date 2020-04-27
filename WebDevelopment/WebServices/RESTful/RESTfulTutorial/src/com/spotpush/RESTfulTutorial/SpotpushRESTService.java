package com.spotpush.RESTfulTutorial;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/")
public class SpotpushRESTService {

	@POST
	@Path("/spotpushService")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response spotpushREST(InputStream incomingData) {
		StringBuilder spotpushBuilder = new StringBuilder();
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
			String line = null;
			while ((line = in.readLine()) != null) {
				spotpushBuilder.append(line);
			}
		} catch (Exception e) {
			System.out.println("Error Parsing: -");
		}
	
		System.out.println("Data Received: "+ spotpushBuilder.toString());
		return Response.status(200).entity(spotpushBuilder.toString()).build();
	}
	
	@GET
	@Path("/verify")
	@Produces(MediaType.TEXT_PLAIN)
	public Response verityRESTService(InputStream incoming) {
		String result = "Spotpush REST Service Successfully started...";
		return Response.status(200).entity(result).build();
	}
}
