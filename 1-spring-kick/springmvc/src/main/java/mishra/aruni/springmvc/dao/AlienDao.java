package mishra.aruni.springmvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import mishra.aruni.springmvc.model.Alien;

/**
 * Alien Data access object
 * 
 * @author Aruni Mishra
 *
 */
@Component
public class AlienDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public List<Alien> getAliens() {
		Session session = sessionFactory.getCurrentSession();
		List<Alien> aliens = session.createQuery("from alien",Alien.class).list();
		return aliens;
	}

	@Transactional
	public void addAlien(Alien a) {
		Session session = sessionFactory.getCurrentSession();
		session.save(a);
	}

	@Transactional
	public Alien getAlien(int id) {
		Session session = sessionFactory.getCurrentSession();
		Alien alien = session.get(Alien.class, id);
		return alien;
	}
}