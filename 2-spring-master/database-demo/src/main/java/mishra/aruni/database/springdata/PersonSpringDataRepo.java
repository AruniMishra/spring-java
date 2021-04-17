package mishra.aruni.database.springdata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mishra.aruni.database.springdata.entity.PersonSpringData;

@Repository
public interface PersonSpringDataRepo extends JpaRepository<PersonSpringData, Integer> {

}
