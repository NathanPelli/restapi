package com.restapi.jersey.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.restapi.jersey.service.RestService;
@Component
@Path("demo")
public class RestfulResource {
	@Autowired
	RestService restService;
	
	@GET
	@Path("say")
	public String sayHello(){
		return restService.sayHello();
	}
}
