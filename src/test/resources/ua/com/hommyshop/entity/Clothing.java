package ua.com.hommyshop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

	@ManyToOne
	private User user;

	public Clothing(String name, Brand brand, Color color, Size size, Category category, Subcategory subcategory,
			User user) {
		super();
		this.name = name;
		this.brand = brand;
		this.color = color;
		this.size = size;
		this.category = category;
		this.subcategory = subcategory;
		this.user = user;
	}

	public Clothing(String name, Brand brand, Color color, Size size, Category category, Subcategory subcategory) {
		super();
		this.name = name;
		this.brand = brand;
		this.color = color;
		this.size = size;
		this.category = category;
		this.subcategory = subcategory;
	}
}
