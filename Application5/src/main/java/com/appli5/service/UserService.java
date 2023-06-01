package com.appli5.service;

import java.util.List;

import com.appli5.modle.User;

public interface UserService {

	public User addUser(User user);

	public User getUser(Integer id);

	public List<User> getAllData(User u);

	public void deleteById(int id);

	public void updateUser(User u, int id);
}
