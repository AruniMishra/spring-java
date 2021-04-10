package mishra.aruni.database.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mishra.aruni.database.jdbc.entity.Person;

@Repository
public class PersonJdbc {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Person> getAll() {

		return jdbcTemplate.query("SELECT * FROM PERSON ", new BeanPropertyRowMapper<Person>(Person.class));
	}

}
