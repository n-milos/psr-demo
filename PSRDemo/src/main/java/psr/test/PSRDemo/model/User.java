package psr.test.PSRDemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users", schema = "public")
public class User {
	//Promjena master post 1
	//Promjena master post 2
	//Promjena master post 3
	@Id
	@Column(name = "id", updatable = false, nullable = false, unique = true)
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name = "username")
	private String username;
	@Column(name = "email")
	private String email;
	@Column(name = "addqress")
	private String address;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	//Linija 1
	//Linija 2
	//Linija 3
	//Linija 4


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	//Dorada

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	//Linija 1
	//Linija 1
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	jagoda
   pita volim li da se suncam i kako podnosim sunce...i reko sto..nako kaze
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + ", address="
				+ address + "]";
	}
	//Promjena grana 1
	//Promjena grana 2
	//Promjena grana 3
}
