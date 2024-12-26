package mishra.aruni.myapp.web;

import mishra.aruni.myapp.entities.Person;
import mishra.aruni.myapp.models.CreatePersonRequest;
import mishra.aruni.myapp.models.PagedResult;
import mishra.aruni.myapp.models.UpdatePersonRequest;
import mishra.aruni.myapp.models.UpdatePersonWebRequest;
import mishra.aruni.myapp.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    // @GetMapping
    // public List<Person> getAllPersons() {
    //     return personService.getAllPersons(pageNo);
    // }

    @GetMapping
    public PagedResult<Person> getAllPersons(@RequestParam("1") int pageNo) {
        return personService.getAllPersons(pageNo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable Long id) {
        return personService.getPersonById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // @PostMapping
    // @ResponseStatus(HttpStatus.CREATED)
    // // public Person createPerson(@RequestBody @Validated Person person) {
    // public ResponseEntity<Person> createPerson(@RequestBody @Validated Person person) {
    //     // return personService.createPerson(person);
    //     return ResponseEntity.status(HttpStatus.CREATED).body(personService.createPerson(person));
    // }


    // specific payload
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Person> createPerson(@RequestBody @Validated CreatePersonRequest request) {
        // return personService.createPerson(person);
        return ResponseEntity.status(HttpStatus.CREATED).body(personService.createPerson(request));
    }

    // @PutMapping("/{id}")
    // public Person updatePerson(
    //         @PathVariable Long id,
    //         @RequestBody @Validated Person person) {
    //     person.setId(id);
    //     return personService.updatePerson(person);
    // }


    // specific payload
    @PutMapping("/{id}")
    public Person updatePerson(
            @PathVariable Long id,
            @RequestBody @Validated UpdatePersonWebRequest request) {
        UpdatePersonRequest updatePersonRequest =
                new UpdatePersonRequest(id, request.name(), request.dob());

        return personService.updatePerson(updatePersonRequest);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id) {
        personService.deletePerson(id);
    }
}
