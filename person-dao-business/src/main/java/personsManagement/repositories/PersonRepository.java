package personsManagement.repositories;

import org.springframework.data.repository.CrudRepository;

import personsManagement.entities.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

}
