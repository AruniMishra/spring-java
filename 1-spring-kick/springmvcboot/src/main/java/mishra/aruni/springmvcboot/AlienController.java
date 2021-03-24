package mishra.aruni.springmvcboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mishra.aruni.springmvcboot.Model.Alien;

@RestController
public class AlienController {

	@Autowired
	AlienRepo alienRepo;

	@GetMapping(path="aliens", produces = {"application/json"})
	@ResponseBody
	public List<Alien> getAliens() {
		List<Alien> aliens = alienRepo.findAll();

		return aliens;
	}

	@GetMapping("alien/{id}")
	@ResponseBody
	public Optional<Alien> getAlien(@PathVariable("id") int id) {
		Optional<Alien> alien = alienRepo.findById(id);

		return alien;
	}

	@PostMapping(path= "alien", consumes = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Alien addAlien(@RequestBody Alien alien) {
		alienRepo.save(alien);

		return alien;
	}
}
