package mishra.aruni.myapp.services;

import mishra.aruni.myapp.entities.Person;
import mishra.aruni.myapp.models.CreatePersonRequest;
import mishra.aruni.myapp.models.PagedResult;
import mishra.aruni.myapp.models.PersonBasicView;
import mishra.aruni.myapp.models.UpdatePersonRequest;
import mishra.aruni.myapp.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class PersonService {
    @Autowired
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    // public List<Person> getAllPersons() {
    //     return personRepository.findAll()
    //             .stream().filter(Person::isActive)
    //             .toList();
    // }

    // pagination
    // public PagedResult<Person> getAllPersons(int pageNo) {
    //     Pageable pageable = PageRequest.of(pageNo - 1, 10, Sort.by("id").ascending());
    //
    //     Page<Person> personPage = personRepository.findAll(pageable);
    //
    //     return new PagedResult<>(personPage.getContent(),
    //             personPage.getTotalElements(),
    //             personPage.getTotalPages(),
    //             personPage.getNumber() + 1);
    // }


    // fix - Loading entire entities and using only a small subset of fields
    public PagedResult<PersonBasicView> getAllPersons(int pageNo) {
        Pageable pageable = PageRequest.of(pageNo - 1, 10, Sort.by("id").ascending());

        Page<PersonBasicView> personPage = personRepository.findAllBy(pageable);

        return new PagedResult<>(personPage.getContent(),
                personPage.getTotalElements(),
                personPage.getTotalPages(),
                personPage.getNumber() + 1);
    }

    public Optional<Person> getPersonById(Long id) {
        return personRepository.findById(id);
    }

    // public Person createPerson(Person person) {
    //     return personRepository.save(person);
    // }

    // specific payload
    public Person createPerson(CreatePersonRequest request) {
        Person person = new Person(request.name(),
                request.email(), request.password(),
                request.dob(), true, request.phones());

        return personRepository.save(person);
    }

    // public Person updatePerson(Person person) {
    //     return personRepository.save(person);
    // }

    // specific payload
    public Person updatePerson(UpdatePersonRequest request) {
        Person person = personRepository.findById(request.id())
                .orElseThrow(() -> new RuntimeException("Person not found"));
        person.setName(request.name());
        person.setDob(request.dob());
        return personRepository.save(person);
    }

    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }

    public Optional<Person> login(String email, String password) {
        // return personRepository.findByEmailAndPasswordAndActiveIsTrue(email, password);

        // fix - findByEmailAndPasswordAndActiveIsTrue
        return personRepository.login(email, password);
    }
}
