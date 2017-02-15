package ua.com.hommyshop.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.hommyshop.dao.SubcategoryDao;
import ua.com.hommyshop.entity.Subcategory;
import ua.com.hommyshop.service.SubcategoryService;

@Service
public class SubcategoryServiceImp implements SubcategoryService {

	@Autowired
	private SubcategoryDao subcategoryDao;

	public void save(Subcategory subcategory) {
		subcategory.getType().toUpperCase();
		subcategoryDao.save(subcategory);
	}

	public List<Subcategory> findAll() {
		return subcategoryDao.findAll();
	}

	public Subcategory findOne(int id) {
		return subcategoryDao.findOne(id);
	}

	public void delete(int id) {
		subcategoryDao.delete(id);
	}

	public Subcategory findByType(String type) {
		return subcategoryDao.findByType(type);
	}

	public void delete(String type) {
		subcategoryDao.delete(findByType(type));
	}
}