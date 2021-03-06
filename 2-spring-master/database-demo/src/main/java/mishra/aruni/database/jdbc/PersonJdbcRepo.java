package mishra.aruni.database.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mishra.aruni.database.jdbc.entity.Person;

@Repository
public class PersonJdbcRepo {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Person> findAll() {

		// return jdbcTemplate.query("select * from person ", new BeanPropertyRowMapper<Person>(Person.class));

		// using custom mapper
		return jdbcTemplate.query("select * from person ", new PersonRowMapper());
	}

	public Person findById(int id) {

		return jdbcTemplate.queryForObject("select * from person where id=?",
				new BeanPropertyRowMapper<Person>(Person.class), id);
	}

	public int deletebyId(int id) {

		return jdbcTemplate.update("delete from person where id=?", id);
	}

	public int insert(Person person) {

		return jdbcTemplate.update("insert into person values (?, ?, ?, ?)", person.getId(), person.getName(),
				person.getLocation(), person.getBirthDate());
	}

	public int update(Person person) {

		return jdbcTemplate.update("update person set name = ?, location = ?, birth_date = ? where id = ? ",
				person.getName(), person.getLocation(), person.getBirthDate(), person.getId());
	}

}
