package ua.com.hommyshop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.hommyshop.entity.Clothing;

public interface ClothingDao extends JpaRepository<Clothing, Integer> {

	// @Query("select d from Dish d where d.name=:name")
	// public Dish findDishByName(@Param("name")String name);

	Clothing findByName(String name);
}
