package Entitis;

import java.time.LocalDate;

public class Gamer {
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String NationalityId;
	
	
	public Gamer(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		NationalityId = nationalityId;
	}


	public int getId() {
		return id;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}


	public String getNationalityId() {
		return NationalityId;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}


	
	
	

}
