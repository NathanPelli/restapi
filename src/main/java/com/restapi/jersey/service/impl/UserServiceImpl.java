package com.restapi.jersey.service.impl;

import java.util.List;

import com.restapi.jersey.dao.UserDao;
import com.restapi.jersey.domain.User;
import com.restapi.jersey.service.UserService;

public class UserServiceImpl implements UserService{
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public int insertUser(User user) {
		return this.userDao.insert(user);
	}

	public int updateUser(User user) {
		return this.userDao.update(user);
	}

	public int delete(String username) {
		return this.userDao.delete(username);
	}

	public List<User> selectAll() {
		return this.userDao.selectAll();
	}

	public int countAll() {
		return this.userDao.countAll();
	}

	public User findByUserName(String username) {
		return this.userDao.findByUserName(username);
	}
	
}
