package ua.com.hommyshop.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.hommyshop.dao.ColorDao;
import ua.com.hommyshop.entity.Color;
import ua.com.hommyshop.service.ColorService;

@Service
public class ColorServiceImp implements ColorService {

	@Autowired
	private ColorDao colorDao;

	public void save(Color color) {
		color.getColor().toUpperCase();
		colorDao.save(color);
	}

	public List<Color> findAll() {
		return colorDao.findAll();
	}

	public Color findOne(int id) {
		return colorDao.findOne(id);
	}

	public void delete(int id) {
		colorDao.delete(id);
	}

	public void update(Color color) {
		colorDao.save(color);
	}

	public void delete(String color) {
		colorDao.delete(findByColor(color));
	}

	public Color findByColor(String color) {
		return colorDao.findByColor(color);
	}
}