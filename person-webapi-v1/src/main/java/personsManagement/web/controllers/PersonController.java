package personsManagement.web.controllers;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import personManagement.web.helpers.Static;
import personsManagement.entities.Person;
import personsManagement.managers.IPersonManager;
import personsManagement.web.models.DeletePerson;
import personsManagement.web.models.PutAddPerson;
import personsManagement.web.models.Response;


@RestController
public class PersonController {

	@Autowired
	private IPersonManager personManager;
	
	
	private Response getPerson(long id) {
		
		Person person = null;
		try {
			person = personManager.getPersonById(id);
		} catch (Exception e1) {
			return new Response(1, Static.getErreursForException(e1));
		}
		// existant person 
		if (person == null) {
			return new Response(2, null);
		}
		// ok
		return new Response(0, person);
	}
	
	
	// Persons list
	@RequestMapping(value = "/getAllPersons", method = RequestMethod.GET)
	public Response getAllPersons(HttpServletResponse response) {
		
		// persons List
		try {
			return new Response(0, personManager.getAllPersons());
		} catch (Exception e) {
			return new Response(1, Static.getErreursForException(e));
		}
	}
	
	
	@RequestMapping(value = "/getPersonById/{id}", method = RequestMethod.GET)
	public Response getClientById(@PathVariable("id") long id) {
		return getPerson(id);
	}
	
	
	@RequestMapping(value = "/addPerson", method = RequestMethod.PUT, consumes = "application/json; charset=UTF-8")
	public Response addPerson(@RequestBody PutAddPerson post, HttpServletResponse response) {
	
		Person person;
		try {
			person = personManager.addPerson(post.getFirstName(), post.getLastName(), post.getPhoto(), post.getCv());
	
		   System.out.println(person.toString());
		
		
		} catch (Exception e1) {
			return new Response(5, Static.getErreursForException(e1));
		}
		// on rend la réponse
		return new Response(0, Static.getMapForPerson(person));
	}
	
	
	@RequestMapping(value = "/deletePerson", method = RequestMethod.POST, consumes = "application/json; charset=UTF-8")
	public Response deletePerson(@RequestBody DeletePerson post, HttpServletResponse response) {

		// on récupère les valeurs postées
		long idperson = post.getIdPerson();
		// on récupère le rv
		Response resp = getPerson(idperson);
		if (resp.getStatus() != 0) {
			return resp;
		}
		// suppression de la personne
		try {
			personManager.supprimerPerson(idperson);
		} catch (Exception e1) {
			return new Response(3, Static.getErreursForException(e1));
		}
		// ok
		return new Response(0, null);
	}
	
	
	public IPersonManager getPersonManager() {
		return personManager;
	}

	public void setPersonManager(IPersonManager personManager) {
		this.personManager = personManager;
	}
	
}
