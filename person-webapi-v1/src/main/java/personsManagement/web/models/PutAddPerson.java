package personsManagement.web.models;

public class PutAddPerson {

	private String firstName;
	private String lastName;
	private String photo;
	private String cv;

		
	public PutAddPerson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PutAddPerson(String firstName, String lastName, String photo, String cv) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.photo = photo;
		this.cv = cv;
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
