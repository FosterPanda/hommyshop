package ua.com.hommyshop.service;

import java.util.List;

import ua.com.hommyshop.entity.Brand;

public interface BrandService {

	void save(Brand brand);
	void update(Brand brand);
	List<Brand> findAll();
	Brand findOne(int id);
	void delete(int id);
	void delete(String name);
	Brand findByName(String name);
}
