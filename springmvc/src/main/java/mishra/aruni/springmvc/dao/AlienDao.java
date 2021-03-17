package mishra.aruni.springmvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mishra.aruni.springmvc.Model.Alien;

/**
 * Alien Data access object
 * 
 * @author Aruni Mishra
 *
 */
@Component
public class AlienDao {

	@Autowired
	private SessionFactory sessionFactoyry;

	public List<Alien> getAliens() {

		Session session = sessionFactoyry.getCurrentSession();
		List<Alien> aliens = session.createQuery("from Alien", Alien.class).list();

		return aliens;
	}
}