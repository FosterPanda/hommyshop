package ua.com.hommyshop.service;

import java.util.List;

import ua.com.hommyshop.entity.Brand;
import ua.com.hommyshop.entity.Category;
import ua.com.hommyshop.entity.Clothing;
import ua.com.hommyshop.entity.Color;
import ua.com.hommyshop.entity.Size;
import ua.com.hommyshop.entity.Subcategory;

public interface ClothingService {

	void save(Clothing clothing);
	List<Clothing> findAll();
	Clothing findOne(int id);
	void delete(int id);
	void delete(String name);
	void update(Clothing clothing);
	Clothing findByName(String name);
	void addAllToClothing(String name, String brandName, String colorName, String sizeType,
			String categoryType, String subcategoryType);
}