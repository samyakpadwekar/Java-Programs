package assgn5;

import java.util.Scanner;

import Assgn5.Address;
import Assgn5.Date;
import Assgn5.Person;

public class Main {
	static Scanner sc = new Scanner(System.in); 
	private static void acceptRecord(Date date) {
		if( date != null ) {
			System.out.print("Day	:	");
			date.setDay(sc.nextInt());
			System.out.print("Month	:	");
			date.setMonth(sc.nextInt());
			System.out.print("year	:	");
			date.setYear(sc.nextInt());
		}
	}
	private static void acceptRecord(Address address) {
		if( address != null ) {
			System.out.print("City Name	:	");
			address.setCity(sc.nextLine());
			System.out.print("State Name	:	");
			address.setState(sc.nextLine());
			System.out.print("Pin Code	:	");
			address.setPincode(sc.nextLine());
		}
	}

	private static void acceptRecord(Person person) {
		System.out.print("Name	:	");
		person.setName(sc.nextLine());
		Date birthDate = person.getBirthdate();
		Main.acceptRecord(birthDate);
		sc.nextLine();
		Address address = person.getAddress();
		Main.acceptRecord(address);
	}
	private static void printRecord(Date date) {
		if( date != null ) {
			System.out.println("Date	:	"+date.getDay()+" / "+date.getMonth()+" / "+date.getYear());
		}
	}
	private static void printRecord(Address address) {
		if( address != null ) {
			System.out.println("Address	:	");
			System.out.println("City :	"+address.getCity());
			System.out.println("State : "+address.getState());
			System.out.println("Pin Code : "+address.getPincode());
		}
	}
	private static void printRecord(Person person) {
		System.out.println("Name	:	"+person.getName());
		Date birthDate = person.getBirthdate();
		Main.printRecord(birthDate);
		Address address = person.getAddress();
		Main.printRecord(address);
	}
	public static void main(String[] args) {
		Person person  = new Person();
		Main.acceptRecord( person );
		Main.printRecord( person );
	}
	
}

