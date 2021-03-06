package psr.test.PSRDemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "posts", schema = "public")
public class Post {

	@Id
	@Column(name = "id", nullable = false, updatable = false, unique = true)
	private long id;
	@ManyToOne
	@JoinColumn(name = "userid")
	private User user;
	@Column(name = "title")
	private String title;
	@Column(name = "body")
	private String body;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", user=" + user + ", title=" + title + ", body=" + body + "]";
	}
}
