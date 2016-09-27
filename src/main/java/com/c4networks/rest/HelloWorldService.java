package com.c4networks.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path(value = "/helloWorld")
public class HelloWorldService {
	
	@GET
	@Path("/{param}")
	public Response sayHelloWorld(@PathParam("param") String msg){
		System.out.println("I'm in sayHelloWorld()");
		System.out.println("Message is :"+msg);
		msg = "Hey <b>" + msg+"</b> This is a Jersey REST Services Application.";
		return Response.status(200).entity(msg).build();
	}

}
