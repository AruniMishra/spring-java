package mishra.aruni.springmvcboot;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import mishra.aruni.springmvcboot.Model.Alien;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		System.out.println("home controller is requested..");
		return "index";
	}
	
	
	/*
	 * create a generic function to set the attribute to result page 
	 * irrespective of the path invoked
	 */
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name", "Aruni");
	}



	// using HttpServletRequest
	/*
	 *
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


	//using @RequestParam
	/*
	@RequestMapping("add")
	public String add(@RequestParam("num1") int num1, @RequestParam("num2")int num2, HttpSession session) {
		int sum= num1 + num2;

		session.setAttribute("sum", sum);

		return "result.jsp";
	}
	 */

	//using ModelAndView
	/*
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2")int num2) {
		ModelAndView mv = new ModelAndView("result");
		//mv.setViewName("result");

		int sum= num1 + num2;
		mv.addObject("sum", sum);

		return mv;
	}
	 */

	//using Model / ModelMap
	@RequestMapping("add")
	public String add(@RequestParam("num1") int num1, @RequestParam("num2")int num2, ModelMap m) {

		int sum= num1 + num2;
		m.addAttribute("sum", sum);

		return "result";
	}


	//Using Model- adding Alien
	/*
	@RequestMapping("addAlien")
	public String addAlien(@RequestParam("id") int id, @RequestParam("name")String name, Model model) {

		Alien alien = new Alien();
		alien.setId(id);
		alien.setName(name);
		model.addAttribute("alien", alien);

		return "result";
	}
	 */


	@RequestMapping("addAlien")
	// @ModelAttribute is optional if the object name is same as param and in the JSP
	public String addAlien(@ModelAttribute("alien") Alien a) {

		return "result";
	}

}
