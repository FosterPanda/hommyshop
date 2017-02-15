package ua.com.hommyshop.service;

import java.util.List;

import ua.com.hommyshop.entity.User;

public interface UserService {

	void save(User user);
	void delete(int id);
	void delete(String email);
	List<User> findAll();
	User findOne(int id);
	void update(User user); 
	User findByName(String name);
	User findByEmail(String email);
	User fetchUserWithClothes(String email);
	void addAllToUser(String name, String subname, String email, String password,
			String adress);
	void addCloseToUser(String email, String closeName);
}