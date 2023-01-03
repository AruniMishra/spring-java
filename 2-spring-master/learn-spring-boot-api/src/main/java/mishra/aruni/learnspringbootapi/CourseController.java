package mishra.aruni.learnspringbootapi;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @GetMapping(path = "retriveAllCourse", produces = { "application/json" })
    @ResponseBody
    public List<Course> retriveAllCourse() {
        return Arrays.asList(
                new Course(1, "Learn spring API", "mishra"),
                new Course(2, "Learn Spring", "aruni"));

    }

}
