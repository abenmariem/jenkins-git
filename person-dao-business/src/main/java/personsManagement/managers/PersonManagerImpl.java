package personsManagement.managers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

import personsManagement.entities.Person;
import personsManagement.repositories.PersonRepository;
@Service
public class PersonManagerImpl implements IPersonManager {

	@Autowired
	private PersonRepository personRepository;

	public PersonRepository getPersonRepository() {
		return personRepository;
	}

	public void setPersonRepository(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Override
	public List<Person> getAllPersons() {
		return Lists.newArrayList(personRepository.findAll());
	}

	@Override
	public Person getPersonById(long id) {
		return personRepository.findOne(id);
	}

	@Override
	public Person addPerson(String firstName, String lastName, String photo, String cv) {
		return personRepository.save(new Person(firstName, lastName, photo, cv));
	}

	@Override
	public Person updatePerson(String firstName, String lastName, String photo, String cv) {
		return personRepository.save(new Person(firstName, lastName, photo, cv));
	}

	@Override
	public void supprimerPerson(long idPerson) {
		personRepository.delete(idPerson);
	}

}
