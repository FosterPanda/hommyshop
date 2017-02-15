package ua.com.hommyshop.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Size {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String size;

	@OneToMany(mappedBy = "size")
	private List<Clothing> clothes;

	public Size(String size) {
		super();
		this.size = size;
	}

}
