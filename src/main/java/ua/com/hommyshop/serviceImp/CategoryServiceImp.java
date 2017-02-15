package ua.com.hommyshop.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.hommyshop.dao.CategoryDao;
import ua.com.hommyshop.entity.Category;
import ua.com.hommyshop.service.CategoryService;

@Service
public class CategoryServiceImp implements CategoryService {

	@Autowired
	private CategoryDao categoryDao;

	public void save(Category category) {
		category.getType().toUpperCase();
		categoryDao.save(category);
	}

	public List<Category> findAll() {
		return categoryDao.findAll();
	}

	public Category findOne(int id) {
		return categoryDao.findOne(id);
	}

	public void delete(int id) {
		categoryDao.delete(id);
	}

	public void update(Category category) {
		categoryDao.save(category);
		
	}

	public Category findByType(String type) {
		return categoryDao.findByType(type);
	}

	public void delete(String type) {
		categoryDao.delete(findByType(type));
	}
}
