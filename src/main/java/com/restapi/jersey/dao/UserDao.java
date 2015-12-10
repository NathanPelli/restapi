package com.restapi.jersey.dao;

import java.util.List;

import com.restapi.jersey.domain.User;

public interface UserDao {
	public int insert(User user);
	public int update(User user);
	public int delete(String username);
	public List<User> selectAll();
	public int countAll();
	public User findByUserName(String username);
}
