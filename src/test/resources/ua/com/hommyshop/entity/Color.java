package ua.com.hommyshop.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Color {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String color;

	@OneToMany(mappedBy = "color")
	private List<Clothing> clothes;

	public Color(String color) {
		super();
		this.color = color;
	}

}
