package mishra.aruni.springmvcboot;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mishra.aruni.springmvcboot.Model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

	List<Alien> findByName(String name);
	List<Alien> findByNameOrderByIdDesc(String name);

}
