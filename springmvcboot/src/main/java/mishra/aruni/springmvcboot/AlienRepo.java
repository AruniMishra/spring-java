package mishra.aruni.springmvcboot;

import org.springframework.data.jpa.repository.JpaRepository;

import mishra.aruni.springmvcboot.Model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> {
	
	

}
