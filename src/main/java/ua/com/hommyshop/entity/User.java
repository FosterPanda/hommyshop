package ua.com.hommyshop.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class User {

	public User() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	private String subname;
	private String email;
	private String password;
	private String adress;

	@ManyToMany
	private List<Clothing> clothes;

	public User(String name, String subname, String email, String password,
			String adress) {
		this.name = name;
		this.subname = subname;
		this.email = email;
		this.password = password;
		this.adress = adress;
	}
	

	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubname() {
		return subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public List<Clothing> getClothes() {
		return clothes;
	}

	public void setClothes(List<Clothing> clothes) {
		this.clothes = clothes;
	}

}
