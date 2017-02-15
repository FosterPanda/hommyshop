package ua.com.hommyshop.service;

import java.util.List;

import ua.com.hommyshop.entity.Color;

public interface ColorService {

	void save(Color color);
	void update(Color color);
	List<Color> findAll();
	Color findOne(int id);
	void delete(int id);
	void delete(String color);
	Color findByColor(String color);
	
}