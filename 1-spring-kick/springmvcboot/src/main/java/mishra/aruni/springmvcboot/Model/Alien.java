package mishra.aruni.springmvcboot.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "alien")
public class Alien {

	@Id
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + "]";
	}

	/**
	 * @param id
	 * @param name
	 */
	public Alien(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	/**
	 * 
	 */
	public Alien() {
		super();
	}
	
}
