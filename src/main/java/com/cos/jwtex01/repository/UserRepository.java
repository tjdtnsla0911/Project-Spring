package com.cos.jwtex01.repository;



import java.util.List;

import com.cos.jwtex01.model.User;


public interface UserRepository {
	User fetchUserByID(int id);
	public void save(User user);
	public User findByUsername(String username);
	public User login(User user);
	List<User> userList();
	void updateUser(User user);
	void deleteUser(int id);

}
