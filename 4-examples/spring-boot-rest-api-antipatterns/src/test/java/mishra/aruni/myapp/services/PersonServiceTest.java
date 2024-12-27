package mishra.aruni.myapp.services;

import mishra.aruni.myapp.entities.Person;
import mishra.aruni.myapp.models.PagedResult;
import mishra.aruni.myapp.repositories.PersonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
    public void testGetPersonById() {
        when(personRepository.findById(1L)).thenReturn(Optional.of(person1));

        Optional<Person> result = personService.getPersonById(1L);

        assertTrue(result.isPresent());
        assertEquals(person1, result.get());
    }

   // @Test
   //  public void testCreatePerson() {
   //      when(personRepository.save(person1)).thenReturn(person1);
   //
   //      Person result = personService.createPerson(person1);
   //
   //      assertEquals(person1, result);
   //  }

    // @Test
    // public void testUpdatePerson() {
    //     when(personRepository.save(person1)).thenReturn(person1);
    //
    //     Person result = personService.updatePerson(person1);
    //
    //     assertEquals(person1, result);
    // }

    @Test
    public void testDeletePerson() {
        doNothing().when(personRepository).deleteById(1L);

        personService.deletePerson(1L);

        verify(personRepository, times(1)).deleteById(1L);
    }

    // @Test
    // public void testLogin() {
    //     when(personRepository.findByEmailAndPasswordAndActiveIsTrue("email@example.com", "password"))
    //             .thenReturn(Optional.of(person1));
    //
    //     Optional<Person> result = personService.login("email@example.com", "password");
    //
    //     assertTrue(result.isPresent());
    //     assertEquals(person1, result.get());
    // }

    // @Test
    // public void testGetAllPersons_FirstPage() {
    //     List<Person> persons = Arrays.asList(person1, person2);
    //     Page<Person> personPage = new PageImpl<>(persons);
    //
    //     when(personRepository.findAll(any(Pageable.class))).thenReturn(personPage);
    //
    //     PagedResult<Person> result = personService.getAllPersons(1);
    //
    //     assertEquals(1, result.pageNumber());
    //     assertEquals(1, result.totalPages());
    //     assertEquals(2, result.totalElements());
    // }
    //
    // @Test
    // public void testGetAllPersons_EmptyPage() {
    //     List<Person> persons = Arrays.asList();
    //     Page<Person> personPage = new PageImpl<>(persons);
    //
    //     when(personRepository.findAll(any(Pageable.class))).thenReturn(personPage);
    //
    //     PagedResult<Person> result = personService.getAllPersons(1);
    //
    //     assertEquals(1, result.pageNumber());
    //     assertEquals(1, result.totalPages());
    //     assertEquals(0, result.totalElements());
    // }
    //
    // @Test
    // public void testGetAllPersons_MultiplePages() {
    //     List<Person> persons = Arrays.asList(person1, person2);
    //     Page<Person> personPage = new PageImpl<>(persons, PageRequest.of(0, 10), 20);
    //
    //     when(personRepository.findAll(any(Pageable.class))).thenReturn(personPage);
    //
    //     PagedResult<Person> result = personService.getAllPersons(1);
    //
    //     assertEquals(1, result.pageNumber());
    //     assertEquals(2, result.totalPages());
    //     assertEquals(20, result.totalElements());
    // }
}