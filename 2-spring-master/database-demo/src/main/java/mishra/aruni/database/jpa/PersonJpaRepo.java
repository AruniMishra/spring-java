package mishra.aruni.database.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import mishra.aruni.database.jpa.entity.PersonJpa;

@Repository
@Transactional
public class PersonJpaRepo {

	@PersistenceContext
	EntityManager entityManager;

	public PersonJpa findById(int id) {

		return entityManager.find(PersonJpa.class, id);
	}
	
	public PersonJpa update(PersonJpa personJpa) {

		return entityManager.merge(personJpa);
	}
	
	public PersonJpa insert(PersonJpa personJpa) {

		return entityManager.merge(personJpa);
	}
}
