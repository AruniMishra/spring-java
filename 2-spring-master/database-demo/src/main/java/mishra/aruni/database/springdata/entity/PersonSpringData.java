package mishra.aruni.database.springdata.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity(name = "person")
@NamedQuery(name="find_all_person", query= "select person from person person")
public class PersonSpringData {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String location;
	private Date birthDate;

	public PersonSpringData() {
	};

	/**
	 * for JPA
	 * 
	 * @param name
	 * @param location
	 * @param birthDate
	 */
	public PersonSpringData(String name, String location, Date birthDate) {
		super();
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}

	/**
	 * @param id
	 * @param name
	 * @param location
	 * @param birthDate
	 */
	public PersonSpringData(int id, String name, String location, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", location=" + location + ", birthDate=" + birthDate + "]";
	}

}
