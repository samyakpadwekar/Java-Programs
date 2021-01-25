package Assgn5;

public class Person {
	private String name;
	private Date birthDate;
	private Address address;
	
	public Person() {
		this.name = new String();
		this.birthDate = new Date();
		this.address = new Address();
	}
	
	public Person(String name, int day, int month, int year, String street, String city, String state, String pincode) {
		this.name = name;
		this.birthDate = new Date(day,month,year);
		this.address = new Address(street, city, state, pincode);
	}

	public Person(String name, Date birthDate, Address address) {
		this.name = name;
		this.birthDate = birthDate;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthdate() {
		return birthDate;
	}

	public void setDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
