package phoneBook;

import java.util.*;

public class TestMyPhoneBookApp extends Person
{

	public static void main(String[] args)
	{
		String streetAddress = "114 Market St";
		String city = "St. Louis";
		String state = "MO";
		int zipCode = 63403;
		Address(streetAddress, city, state, zipCode);
	
		Scanner in = new Scanner(System.in);
		Boolean running = true;
		
		int uniquedId = 1;
		String firstName = "Steve";
		String middleName = "Bruce";
		String lastName = "Goldman";
		String phoneNumber = "3145503869";
		
		Person(uniquedId, firstName, middleName, lastName, phoneNumber);
    	String areaCode = phoneNumber.substring(0,3); 
    	String excNumber = phoneNumber.substring(3,6);
    	String number = phoneNumber.substring(6);
    	String formatPhoneNumber = "(" + areaCode + ")-" + excNumber + "-" + number;  
    
		System.out.println(uniquedId + " " + firstName + " " + middleName + " " + lastName + " " + formatPhoneNumber);
		
		while (running)
		 {
			 System.out.println("\nEnter 1 to add a person to the phone book" +
					   			"\nEnter 2 to update a person in the phone book" +
					   			"\nEnter 3 to delete a person from the phone book" +
					   			"\nEnter 4 to list all persons in the phone book" +
					   			"\nEnter 5 to search the phone book" +
					 			"\nEnter 6 to exit the program" );
	int answer = in.nextInt();
	switch(answer)
	{
	case 1:
		 
		break;
	case 2:
		 
		break;
	case 3:
		
		break;
	case 4:
		
		break;
	case 5:
		System.out.println("\nEnter 10 to search by first name" +
	   					   "\nEnter 11 to search by last name" +
	   					   "\nEnter 12 to search by full name" +
	   					   "\nEnter 13 to search by phone number" +
	   					   "\nEnter 14 to search by city" +
	 					   "\nEnter 15 to search by state" );
		int answer2 = in.nextInt();
		switch(answer2)
		{
		case 10:
			
			break;
		case 11:
			
			break;
		case 12:
			
			break;
		case 13: 
			
			break;
		case 14:
			
			break;
		case 15:
			
			break;
		}
	case 6:
		running = false;
		System.exit(0);
		break;
		
	}
}

		 }
		 
		
		
	/*Person(uniquedId, firstName, middleName, lastName, phoneNumber);*/
		
	

	private static void Person(int uniquedId, String firstName, String middleName, String lastName, String phoneNumber)
	{
		System.out.println("I am Here in the Method of the test app");
	}

	private static void Address(String streetAddress, String city, String state, int zipCode)
	{
		 System.out.println("Street Address: " + streetAddress + " " +
						   "City: " + city + " " +
						   "State: " + state + " " +
						   "Zip Code: " + zipCode);
		
		
		
	} 
}
