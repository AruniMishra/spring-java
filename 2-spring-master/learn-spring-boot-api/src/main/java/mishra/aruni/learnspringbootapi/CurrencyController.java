package mishra.aruni.learnspringbootapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {

    @Autowired
    CurrencyServiceConfiguration currencyServiceConfiguration;

    @GetMapping(path = "currency", produces = { "application/json" })
    @ResponseBody
    public CurrencyServiceConfiguration retriveAllCourse() {
        return currencyServiceConfiguration;

    }

}
