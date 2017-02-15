package ua.com.hommyshop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import java.util.List;

@Entity
public class Clothing {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	@ManyToOne
	private Brand brand;

	@ManyToOne
	private Color color;

	@ManyToOne
	private Size size;

	@ManyToOne
	private Category category;

	@ManyToOne
	private Subcategory subcategory;

	@ManyToMany(mappedBy="clothes")
	private List<User> users;
	
	public Clothing() {
	}

	public Clothing(String name, Brand brand, Color color, Size size,
			Category category, Subcategory subcategory) {
		this.name = name;
		this.brand = brand;
		this.color = color;
		this.size = size;
		this.category = category;
		this.subcategory = subcategory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Subcategory getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(Subcategory subcategory) {
		this.subcategory = subcategory;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
}
