package ua.com.hommyshop.service;

import java.util.List;

import ua.com.hommyshop.entity.Subcategory;

public interface SubcategoryService {

	void save(Subcategory subcategory);
	List<Subcategory> findAll();
	Subcategory findOne(int id);
	void delete(int id);
	void delete(String subcategory);
	Subcategory findByType(String type);
}