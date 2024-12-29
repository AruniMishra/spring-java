package mishra.aruni.myapp.repositories;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

// @SpringBootTest

// fix - Using @SpringBootTest for testing slices (controller, repository)
// @DataJpaTest

@DataJpaTest(
        properties = {
                "spring.datasource.url= jdbc:mysql://localhost:3306/mishra",
                "spring.datasource.username=root",
                "spring.datasource.password=pass123"
        }
)
class PersonRepositoryTest {
    @Autowired
    private PersonRepository personRepository;

    @Test
    void shouldGetPersonByIdReturnEmptyWhenNotFound() {
        var person = personRepository.findById(1L);
        Assertions.assertThat(person).isNotEmpty();
    }
}