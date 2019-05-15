package psr.test.PSRDemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users", schema = "public")
public class User {
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
<<<<<<< HEAD
	public long getId() {
		return id;
	}
=======

	public long getId() {
		return id;
	}
	//Dodat komentar 3
>>>>>>> 7d800f0b151ce7237937d66331ba6dc5150a846c

	public void setId(long id) {
		this.id = id;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + ", address="
				+ address + "]";
	}

}
