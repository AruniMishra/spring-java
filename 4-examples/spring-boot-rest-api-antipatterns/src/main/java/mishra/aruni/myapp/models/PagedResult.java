package mishra.aruni.myapp.models;

public record PagedResult<T>(
        Iterable<T> data,
        long totalElements,
        int totalPages,
        int pageNumber) {
}
