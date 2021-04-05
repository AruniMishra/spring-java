package mishra.aruni.springbatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mishra.aruni.springbatch.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
}
