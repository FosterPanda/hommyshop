package ua.com.hommyshop.service;

import java.util.List;

import ua.com.hommyshop.entity.Size;

public interface SizeService {

	void save(Size size);
	List<Size> findAll();
	Size findOne(int id);
	void delete(int id);
	void delete(String size);
	void update(Size size);
	Size findBySize(String size);
}