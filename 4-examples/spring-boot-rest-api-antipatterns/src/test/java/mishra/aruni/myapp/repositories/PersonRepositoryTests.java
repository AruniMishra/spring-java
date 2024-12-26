package mishra.aruni.myapp.repositories;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class PersonRepositoryTests {
    @Autowired
    private PersonRepository personRepository;

    @Test
    void shouldGetPersonByIdReturnEmptyWhenNotFound() {
        var person = personRepository.findById(1L);
        Assertions.assertThat(person).isEmpty();
    }
}