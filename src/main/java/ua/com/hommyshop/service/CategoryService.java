package ua.com.hommyshop.service;

import java.util.List;

import ua.com.hommyshop.entity.Category;

public interface CategoryService {

	void save(Category category);
	List<Category> findAll();
	Category findOne(int id);
	void delete(int id);
	void delete(String type);
	Category findByType(String type);
}