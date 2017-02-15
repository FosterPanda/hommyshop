package ua.com.hommyshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.com.hommyshop.entity.User;

public interface UserDao extends JpaRepository<User, Integer>{

//	@Query("select u from User u where u.name=:param")
//	User findUserByName(@Param("param")String name);
	
	User findByName(String name);
	
	User findByEmail(String email);
	
	@Query("select u from User u left join fetch u.clothings where u.email= ?1")
	User fetchUserWithClothes(String email);
}