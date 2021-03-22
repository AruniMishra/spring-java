package mishra.aruni.springsecurity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "user")
public class User {

	@Id
	private long iduser;
	private String username;
	private String password;

	public long getIduser() {
		return iduser;
	}

	public void setIduser(long iduser) {
		this.iduser = iduser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
