package com.restapi.jersey.junit;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.restapi.jersey.domain.User;
import com.restapi.jersey.resources.RestfulResource;
import com.restapi.jersey.service.UserService;

public class SpringMybatisJunit {
	ApplicationContext context = null;
	UserService userService = null;
	@Before
	public void init(){
		this.context = new ClassPathXmlApplicationContext("applicationContext.xml");
		this.userService = (UserService)context.getBean("userService");
	}
	@Test
	public void countAll(){
		System.out.println("�û�������Ϊ��"+userService.countAll());
	}
	@Test
	public void insert(){
		User user = new User();
        user.setUsername("������");
        user.setPassword("passtest");
        user.setEmail("dennisit@163.com");
        user.setSex("��");
        user.setAge(23);
        userService.insertUser(user);
	}
	@Test
	public void spring_component_test(){
		RestfulResource restfulResource = (RestfulResource)context.getBean("restfulResource");
		restfulResource.show();
	}
	@Test
    public void selectAll(){
        List<User> list = userService.selectAll();
        for(int i=0; i<list.size(); i++){
            User user = list.get(i);
            System.out.println("�û���:" + user.getUsername() + "\t����:" + user.getPassword() + "\t���䣺" + user.getEmail());
        }
    }
    
    @Test
    public void update(){
        User user = new User();
        user.setUsername("������");
        user.setPassword("xxxxxxxx");
        user.setEmail("xxxxxx@163xxx");
        user.setSex("��");
        user.setAge(23);
        userService.updateUser(user);
    }
    
    @Test
    public void delete(){
        userService.delete("������");
    }
    
    @Test
    public void findByName(){
        User user = userService.findByUserName("������");
        System.out.println("�û���:" + user.getUsername() + "\t����:" + user.getPassword() + "\t���䣺" + user.getEmail());
    }
}
