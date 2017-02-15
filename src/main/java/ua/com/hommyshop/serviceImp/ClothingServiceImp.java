package ua.com.hommyshop.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.hommyshop.dao.BrandDao;
import ua.com.hommyshop.dao.CategoryDao;
import ua.com.hommyshop.dao.ClothingDao;
import ua.com.hommyshop.dao.ColorDao;
import ua.com.hommyshop.dao.SizeDao;
import ua.com.hommyshop.dao.SubcategoryDao;
import ua.com.hommyshop.dao.UserDao;
import ua.com.hommyshop.entity.Brand;
import ua.com.hommyshop.entity.Category;
import ua.com.hommyshop.entity.Clothing;
import ua.com.hommyshop.entity.Color;
import ua.com.hommyshop.entity.Size;
import ua.com.hommyshop.entity.Subcategory;
import ua.com.hommyshop.service.CategoryService;
import ua.com.hommyshop.service.ClothingService;

@Service
public class ClothingServiceImp implements ClothingService {

	@Autowired
	private BrandDao brandDao;

	@Autowired
	private CategoryDao categoryDao;

	@Autowired
	private ClothingDao clothingDao;

	@Autowired
	private ColorDao colorDao;

	@Autowired
	private SizeDao sizeDao;

	@Autowired
	private SubcategoryDao subcategoryDao;

	@Autowired
	private UserDao userDao;

	public void save(Clothing clothing) {
		clothing.setName(clothing.getName().toUpperCase());
		clothingDao.save(clothing);
	}

	public List<Clothing> findAll() {
		return clothingDao.findAll();
	}

	public Clothing findOne(int id) {
		return clothingDao.findOne(id);
	}

	public void delete(int id) {
		clothingDao.delete(id);
	}

	public void update(Clothing clothing) {
		clothingDao.save(clothing);
	}

	public void delete(String name) {
		clothingDao.delete(findByName(name));
	}

	public Clothing findByName(String name) {
		return clothingDao.findByName(name);
	}

	public void addAllToClothing(String name, String brandName,
			String colorName, String sizeType, String categoryType,
			String subcategoryType) {
		Clothing close = clothingDao.findByName(name);
		Brand brand = brandDao.findByName(brandName);
		Color color = colorDao.findByColor(colorName);
		Size size = sizeDao.findBySize(sizeType);
		Category category= categoryDao.findByType(categoryType);
		Subcategory subcategory= subcategoryDao.findByType(subcategoryType);
		
		close.setBrand(brand);
		close.setCategory(category);
		close.setColor(color);
		close.setSize(size);
		close.setSubcategory(subcategory);
		clothingDao.save(close);
	}
}
