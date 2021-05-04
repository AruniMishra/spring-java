package mishra.aruni.springmvc;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
    public boolean isUserValid(String user, String password){
        return user.equals("aruni") && password.equals("pass");
    }
}
