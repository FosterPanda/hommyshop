package ua.com.hommyshop.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.hommyshop.dao.ClothingDao;
import ua.com.hommyshop.dao.UserDao;
import ua.com.hommyshop.entity.Clothing;
import ua.com.hommyshop.entity.User;
import ua.com.hommyshop.service.UserService;

@Service
public class UserServiceImp implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private ClothingDao clothingDao;
	
	public void save(User user) {
		userDao.save(user);
	}

	public void delete(int id) {
		userDao.delete(id);
	}

	public List<User> findAll() {
		return userDao.findAll();
	}

	public User findOne(int id) {
		return userDao.findOne(id);
	}

	public void update(User user) {
		userDao.save(user);
	}

	public void delete(String email) {
		userDao.delete(findByEmail(email));
	}

	public User findByName(String name) {
		return userDao.findByName(name);
	}

	public User findByEmail(String email) {
		return userDao.findByEmail(email);
	}

	public void addAllToUser(String name, String subname, String email,
			String password, String adress) {
		User user = userDao.findByEmail(email);
		user.setName(name);
		user.setSubname(subname);
		user.setAdress(adress);
		userDao.save(user);
	}
	
	public void addCloseToUser(String email, String closeName){
		User user = userDao.fetchUserWithClothes(email);
		Clothing clothing = clothingDao.findByName(closeName);
		user.getClothes().add(clothing);
		userDao.save(user);
	}

	public User fetchUserWithClothes(String email) {
		return userDao.fetchUserWithClothes(email);
	}
	
}