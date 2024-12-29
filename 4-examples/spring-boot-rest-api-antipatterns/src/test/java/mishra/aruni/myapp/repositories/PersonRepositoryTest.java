package mishra.aruni.myapp.repositories;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

// @SpringBootTest

// fix - Using @SpringBootTest for testing slices (controller, repository)
@DataJpaTest

// fix - test in memory db, Note: a valid Docker environment is required
// @DataJpaTest(
//         properties = {
//                 "spring.test.database.replace=none",
//                 "spring.datasource.url=jdbc:tc:postgresql:16-alpine:///testdb"
//         }
// )
class PersonRepositoryTest {
    @Autowired
    private PersonRepository personRepository;

    @Test
    void shouldGetPersonByIdReturnEmptyWhenNotFound() {
        var person = personRepository.findById(1L);
        Assertions.assertThat(person).isNotEmpty();
    }
}