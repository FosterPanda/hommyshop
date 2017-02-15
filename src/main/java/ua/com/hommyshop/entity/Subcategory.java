package ua.com.hommyshop.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Subcategory {

	
	public Subcategory() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String type;

	@OneToMany(mappedBy = "subcategory")
	private List<Clothing> clothes;

	public Subcategory(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Clothing> getClothes() {
		return clothes;
	}

	public void setClothes(List<Clothing> clothes) {
		this.clothes = clothes;
	}
}
