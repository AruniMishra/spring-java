package mishra.aruni.springsecurity;

import java.security.Principal;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		System.out.println("home controller is requested..");
		return "home.jsp";
	}

	@RequestMapping("/login")
	public String loginPage() {
		return "login.jsp";
	}

	@RequestMapping("/logout-success")
	public String logoutPage() {
		return "logout.jsp";
	}


	@RequestMapping("user")
	@ResponseBody
	public Principal user(Principal principal) {

		return principal;
	}
}
