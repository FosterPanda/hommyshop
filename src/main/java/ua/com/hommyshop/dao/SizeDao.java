package ua.com.hommyshop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ua.com.hommyshop.entity.Category;
import ua.com.hommyshop.entity.Size;

public interface SizeDao extends JpaRepository<Size, Integer> {

	// @Query("select i from Ingredient i where name=:param")
	// Ingredient findIngredientByName(@Param("param")String name);

	Size findBySize(String size);;
}