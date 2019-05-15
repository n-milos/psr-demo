111111111111111111111
package psr.test.PSRDemo.model;
//lokal promjena
//serverska promjena
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
	//Dorada 1
	//Dorada 2
	//Dorada 3

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	//Ovo sam dodao na grani i pull-request saljem na master

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	//Dodata linija 1
	//Dodata linija 2
	//Dodata linija 3

	public String getTitle() {
		return title;
	}
	//Neka promjena na masteru lokalno

	public void setTitle(String title) {
		this.title = title;
	}
	//Opet promjena na masteru
	public String getBody() {
		return body;
	}
	//Jedna dorada
	//Jedna dorada
	//Jedna dorada

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		//Dodao sam ovaj komentar kako bi bilo nesto dodato :D
		return "Post [id=" + id + ", user=" + user + ", title=" + title + ", body=" + body + "]";
		//Dodao sam na grani nesto
		//Jos jedna korekcija
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		if (body == null) {
			if (other.body != null)
				return false;
		} else if (!body.equals(other.body))
			return false;
		if (id != other.id)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((body == null) ? 0 : body.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}
}
