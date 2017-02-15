package ua.com.hommyshop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ua.com.hommyshop.entity.Brand;

public interface BrandDao extends JpaRepository<Brand, Integer> {

	// @Query("select i from Ingredient i where name=:param")
	// Ingredient findIngredientByName(@Param("param")String name);

	Brand findByName(String name);
}
