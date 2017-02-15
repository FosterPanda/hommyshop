package ua.com.hommyshop.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Size {

	
	public Size() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String size;

	@OneToMany(mappedBy = "size")
	private List<Clothing> clothes;

	public Size(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public List<Clothing> getClothes() {
		return clothes;
	}

	public void setClothes(List<Clothing> clothes) {
		this.clothes = clothes;
	}
}
