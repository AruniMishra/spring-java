package mishra.aruni.springmvcboot;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import mishra.aruni.springmvcboot.Model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

	List<Alien> findByName(String name);
	List<Alien> findByNameOrderByIdDesc(String name);
	
	
	@Query("from alien where name=:name")
	List<Alien> find(@Param("name")String name);

}
