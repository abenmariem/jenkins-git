package personsManagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	    
	@Column(name = "FIRSTNAME", nullable = false)
	private String firstName;
	@Column(name = "LASTNAME", nullable = false)
	private String lastName;
	@Column(name = "PHOTO", nullable = false)
	private String photo;
	@Column(name = "CV", nullable = false)
	private String cv;

	public Person() {
		super();
	}

	public Person(String firstName, String lastName, String photo, String cv) {
				
		super();
				
		this.firstName = firstName;
		this.lastName = lastName;
		this.photo = photo;
		this.cv = cv;
	}
	
	public String toString() {
		return String.format("Personne[%s, %s, %s, %s, %s,%s]", id, version, firstName, lastName, photo,cv);
	}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getCv() {
		return cv;
	}

	public void setCv(String cv) {
		this.cv = cv;
	}
		
}
