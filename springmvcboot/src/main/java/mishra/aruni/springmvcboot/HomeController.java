package mishra.aruni.springmvcboot;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		System.out.println("home controller is requested..");
		return "index.jsp";
	}


	/*
	@RequestMapping("add")
	public String add(HttpServletRequest req) {

		int num1= Integer.parseInt(req.getParameter("num1"));
		int num2= Integer.parseInt(req.getParameter("num2"));

		int sum= num1 + num2;

		HttpSession session = req.getSession();
		session.setAttribute("sum", sum);

		//return "result.jsp?sum=" +sum;
		return "result.jsp";

	}
	 */
	@RequestMapping("add")
	public String add(@RequestParam("num1") int num1, @RequestParam("num2")int num2, HttpSession session) {

		int sum= num1 + num2;

		session.setAttribute("sum", sum);

		//return "result.jsp?sum=" +sum;
		return "result.jsp";

	}
	


}
