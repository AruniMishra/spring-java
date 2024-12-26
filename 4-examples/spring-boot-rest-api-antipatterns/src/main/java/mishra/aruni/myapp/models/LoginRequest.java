package mishra.aruni.myapp.models;

import jakarta.validation.constraints.NotEmpty;

public record LoginRequest(@NotEmpty String email,
                           @NotEmpty String password) {}