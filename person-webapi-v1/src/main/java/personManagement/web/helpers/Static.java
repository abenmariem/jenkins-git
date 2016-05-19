package personManagement.web.helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import personsManagement.entities.Person;

public class Static {

	public Static() {
	}

	// liste des messages d'erreur d'une exception
	public static List<String> getErreursForException(Exception exception) {
		// on récupère la liste des messages d'erreur de l'exception
		Throwable cause = exception;
		List<String> erreurs = new ArrayList<String>();
		while (cause != null) {
			erreurs.add(cause.getMessage());
			cause = cause.getCause();
		}
		return erreurs;
	}


	public static Map<String, Object> getMapForPerson(Person person) {
		// qq chose à faire ?
		if (person == null) {
			return null;
		}
		// dictionnaire <String,Object>
		Map<String, Object> hash = new HashMap<String, Object>();
		hash.put("id", person.getId());
		hash.put("firstName", person.getFirstName());
		hash.put("lastName", person.getLastName());
		hash.put("photo", person.getPhoto());
		hash.put("cv", person.getCv());
				
		// on rend le dictionnaire
		return hash;
	}
	
	
	
	
	
	
	
}
