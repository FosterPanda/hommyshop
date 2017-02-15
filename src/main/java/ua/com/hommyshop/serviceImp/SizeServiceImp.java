package ua.com.hommyshop.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.hommyshop.dao.SizeDao;
import ua.com.hommyshop.entity.Size;
import ua.com.hommyshop.service.SizeService;

@Service
public class SizeServiceImp implements SizeService {

	@Autowired
	private SizeDao sizeDao;

	public void save(Size size) {
		size.getSize().toUpperCase();
		sizeDao.save(size);
	}

	public List<Size> findAll() {
		return sizeDao.findAll();
	}

	public Size findOne(int id) {
		return sizeDao.findOne(id);
	}

	public void delete(int id) {
		sizeDao.delete(id);
	}

	public void delete(String size) {
		sizeDao.delete(findBySize(size));
	}

	public void update(Size size) {
		sizeDao.save(size);
	}

	public Size findBySize(String size) {
		return sizeDao.findBySize(size);
	}

}
