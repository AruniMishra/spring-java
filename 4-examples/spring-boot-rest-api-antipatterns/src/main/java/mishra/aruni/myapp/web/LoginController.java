package mishra.aruni.myapp.web;

import mishra.aruni.myapp.entities.Person;
import mishra.aruni.myapp.models.LoginRequest;
import mishra.aruni.myapp.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private PersonService personService;

    @PostMapping("/api/login")
    public ResponseEntity<Person> login(
            @RequestBody @Validated LoginRequest loginRequest) {
        return personService.login(loginRequest.email(), loginRequest.password())
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
    }
}
