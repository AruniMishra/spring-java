package mishra.aruni.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mishra.aruni.springmvc.dao.AlienDao;
import mishra.aruni.springmvc.model.Alien;

@Controller
public class HomeController {

	@Autowired
	AlienDao alieDao;

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



	//using Model / ModelMap
	@RequestMapping("add")
	public String add(@RequestParam("num1") int num1, @RequestParam("num2")int num2, ModelMap m) {

		int sum= num1 + num2;
		m.addAttribute("sum", sum);

		return "result";
	}


	@GetMapping("getAliens")
	public String getAliens(Model model) {
		model.addAttribute("result", alieDao.getAliens());

		return "showAlien";
	}

	@RequestMapping("addAlien")
	// @ModelAttribute is optional if the object name is same as param and in the JSP
	public String addAlien(@ModelAttribute("alien") Alien a) {

		return "result";
	}



}
