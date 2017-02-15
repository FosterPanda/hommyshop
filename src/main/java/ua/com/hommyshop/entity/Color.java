package ua.com.hommyshop.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Color {

	
	public Color() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String color;

	@OneToMany(mappedBy = "color")
	private List<Clothing> clothes;

	public Color(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public List<Clothing> getClothes() {
		return clothes;
	}

	public void setClothes(List<Clothing> clothes) {
		this.clothes = clothes;
	}
}
