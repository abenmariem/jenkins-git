package personsManagement.web.models;

public class DeletePerson {

	private Long idPerson;
	
	public DeletePerson() {
		super();
	}

	public DeletePerson(Long idPerson) {
		super();
		this.idPerson = idPerson;
	}

	public Long getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(Long idPerson) {
		this.idPerson = idPerson;
	}
}
