package personsManagement.managers;

import java.util.List;

import personsManagement.entities.Person;

public interface IPersonManager {

	// lists all persons
		public List<Person> getAllPersons();
	
		// find a person by its id
		public Person getPersonById(long id);
		
		// add a person
		public Person addPerson(String firstName, String lastName, String photo, String cv);

		// update a person
		public Person updatePerson(String firstName, String lastName, String photo, String cv);
		
		// delete a person
		public void supprimerPerson(long idPerson);
	
}
