package mishra.aruni.myapp.repositories;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

// @SpringBootTest
// fix - Using @SpringBootTest for testing slices (controller, repository)
@DataJpaTest
class PersonRepositoryTest {
    @Autowired
    private PersonRepository personRepository;

    @Test
    void shouldGetPersonByIdReturnEmptyWhenNotFound() {
        var person = personRepository.findById(1L);
        Assertions.assertThat(person).isNotEmpty();
    }
}