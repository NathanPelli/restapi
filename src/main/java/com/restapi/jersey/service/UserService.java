package com.restapi.jersey.service;

import java.util.List;

import com.restapi.jersey.domain.User;

public interface UserService {
	public int insertUser(User user);
	public int updateUser(User user);
	public int delete(String username);
	public List<User> selectAll();
	public int countAll();
	public User findByUserName(String username);
}
