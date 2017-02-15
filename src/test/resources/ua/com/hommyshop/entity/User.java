package ua.com.hommyshop.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	private String subname;
	private String email;
	private String password;
	private String adress;

	@OneToMany(mappedBy = "user")
	private List<Clothing> clothes;

	public User(String name, String subname, String email, String password, String adress, List<Clothing> clothes) {
		super();
		this.name = name;
		this.subname = subname;
		this.email = email;
		this.password = password;
		this.adress = adress;
		this.clothes = clothes;
	}

	public User(String name, String subname, String email, String password, String adress) {
		super();
		this.name = name;
		this.subname = subname;
		this.email = email;
		this.password = password;
		this.adress = adress;
	}
}
