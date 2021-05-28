package Entities;

import java.sql.Date;

import Abstracts.Entitiy;

public class Customer implements Entitiy {
	
	private static final long NationalityId = 0;
	private int id;
	private String firstName;
	private String lastName;
	private String identityNumber;
	private Date birthDate;
	
	public Customer() {
		
	}

	public Customer(int id, String firstName, String lastName, String identityNumber, Date birthDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.birthDate = birthDate;
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

	public String getIdentityNumber() {
		return identityNumber;
	}

	public Date getBirthDate() {
		return birthDate;
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

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public static long getNationalityid() {
		return NationalityId;
	}


}
