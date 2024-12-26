package mishra.aruni.myapp.models;

import java.time.LocalDate;

public record UpdatePersonRequest(
        Long id,
        String name,
        LocalDate dob
) {
}
