
package mishra.aruni.myapp.services;

import mishra.aruni.myapp.entities.Person;
import mishra.aruni.myapp.repositories.PersonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    @InjectMocks
    private PersonService personService;

    private Person person1;
    private Person person2;

    @BeforeEach
    public void setUp() {
        person1 = new Person();
        person1.setId(1L);
        person1.setActive(true);

        person2 = new Person();
        person2.setId(2L);
        person2.setActive(false);
    }

    @Test
    public void testGetAllPersons() {
        when(personRepository.findAll()).thenReturn(Arrays.asList(person1, person2));

        List<Person> result = personService.getAllPersons();

        assertEquals(1, result.size());
        assertTrue(result.contains(person1));
        assertFalse(result.contains(person2));
    }

    @Test
    public void testGetPersonById() {
        when(personRepository.findById(1L)).thenReturn(Optional.of(person1));

        Optional<Person> result = personService.getPersonById(1L);

        assertTrue(result.isPresent());
        assertEquals(person1, result.get());
    }

    @Test
    public void testCreatePerson() {
        when(personRepository.save(person1)).thenReturn(person1);

        Person result = personService.createPerson(person1);

        assertEquals(person1, result);
    }

    @Test
    public void testUpdatePerson() {
        when(personRepository.save(person1)).thenReturn(person1);

        Person result = personService.updatePerson(person1);

        assertEquals(person1, result);
    }

    @Test
    public void testDeletePerson() {
        doNothing().when(personRepository).deleteById(1L);

        personService.deletePerson(1L);

        verify(personRepository, times(1)).deleteById(1L);
    }

    @Test
    public void testLogin() {
        when(personRepository.findByEmailAndPasswordAndActiveIsTrue("email@example.com", "password"))
                .thenReturn(Optional.of(person1));

        Optional<Person> result = personService.login("email@example.com", "password");

        assertTrue(result.isPresent());
        assertEquals(person1, result.get());
    }
}