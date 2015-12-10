package com.restapi.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * 
 * @author Nathan
 *
 */
@Path("hello")
public class RestExcample {
	@GET
	@Path("{name}")
	public String sayHello(@PathParam("name") String name){
		StringBuffer stringBuffer = new StringBuffer("SandBox | Hello ");
		stringBuffer.append(name).append("!");
		return stringBuffer.toString();
	}
}
