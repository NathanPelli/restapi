package com.restapi.jersey.resources;

import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.restapi.jersey.service.RestService;
@Component
@Path("demo")
@Produces("text/html")
public class RestfulResource {
	@Autowired
	RestService restService;
	public void show(){
		
	}
	@GET
	public String defaultSay(@DefaultValue("sb") @QueryParam("name") String name){
		return "Hello JordanAndy,name:"+name;
	}
	@GET
	@Path("say/{content}")
	@Produces("text/plain")
	public String sayHello(@PathParam("content") String content){
		return restService.sayHello()+content;
	}
	
	@GET
	public String get(@Context UriInfo ui) {
	    MultivaluedMap<String, String> queryParams = ui.getQueryParameters();
	    MultivaluedMap<String, String> pathParams = ui.getPathParameters();
	    return null;
	}
	
	@GET
	public String get(@Context HttpHeaders hh) {
	    MultivaluedMap<String, String> headerParams = hh.getRequestHeaders();
	    Map<String, Cookie> pathParams = hh.getCookies();
	    return null;
	}
	/**
	 * @param name
	 * @return
	 * 获取client POST过来的表单中的name参数
	 */
	@POST
	@Consumes("application/x-www-form-urlencoded")
	public String respondToPost(@FormParam("name") String name){
		return "name from post:"+name;
	}
}
