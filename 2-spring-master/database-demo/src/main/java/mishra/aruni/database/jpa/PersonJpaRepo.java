package mishra.aruni.database.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import mishra.aruni.database.jpa.entity.PersonJpa;

@Repository
@Transactional
public class PersonJpaRepo {

	@PersistenceContext
	EntityManager entityManager;

	public List<PersonJpa> findAll() {

		TypedQuery<PersonJpa> namedQuery = entityManager.createNamedQuery("find_all_person", PersonJpa.class);

		return namedQuery.getResultList();
	}

	public PersonJpa findById(int id) {

		return entityManager.find(PersonJpa.class, id);
	}

	public PersonJpa update(PersonJpa personJpa) {

		return entityManager.merge(personJpa);
	}

	public PersonJpa insert(PersonJpa personJpa) {

		return entityManager.merge(personJpa);
	}

	public void deleteById(int id) {

		entityManager.remove(findById(id));
	}
}
