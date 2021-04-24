package mishra.aruni.servlet;

public class UserValidationService {

    public boolean isUserValid(String user, String password){
        return user.equals("aruni") && password.equals("pass");
    }
}
