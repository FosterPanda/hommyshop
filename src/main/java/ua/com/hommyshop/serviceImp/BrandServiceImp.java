package ua.com.hommyshop.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.hommyshop.dao.BrandDao;
import ua.com.hommyshop.entity.Brand;
import ua.com.hommyshop.service.BrandService;

@Service
public class BrandServiceImp implements BrandService {

	@Autowired
	private BrandDao brandDao;

	public void save(Brand brand) {
		brand.getName().toUpperCase();
		brandDao.save(brand);
	}

	public List<Brand> findAll() {
		return brandDao.findAll();
	}

	public Brand findOne(int id) {
		return brandDao.findOne(id);
	}

	public void delete(int id) {
		brandDao.delete(id);
	}

	public void update(Brand brand) {
		brandDao.save(brand);

	}

	public void delete(String name) {
		brandDao.delete(findByName(name));
	}

	public Brand findByName(String name) {
		return brandDao.findByName(name);
	}
}
