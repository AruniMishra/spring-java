package mishra.aruni.myapp.repositories;

import mishra.aruni.myapp.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {
    // Optional<Person> findByEmailAndPasswordAndActiveIsTrue(String email, String password);


    // fix - Misusing Spring Data JPA derived-query method names
    @Query("SELECT p FROM Person p WHERE p.email = ?1 AND p.password = ?2 AND p.active=true")
    Optional<Person> login(String email, String password);
}
