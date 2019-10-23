package phoneBook;

import java.util.*;
	
	public class PhoneBookApp
	{	
		public static Person[] persons = new Person[0];
		private static int selection = 0;
		private static int updateSelection = 0;
		private static int searchSelection = 0;
		private static String updatedString ="";
		private static Scanner ScrInt = new Scanner(System.in);
		private static Scanner ScrLine = new Scanner(System.in);
		
		public static void main(String[] args)
		{
			MainMenu();
		}
		
		public static void MainMenu()
		{

			
			System.out.println("Welcome to your Phone Book!");

			do
			{
				System.out.println("Please select from the following activities:");

				System.out.println(	"1 Add a Person\n" + 
								   	"2 Delete a Person\n" +
								   	"3 Update a Person\n"+
								   	"4 Search Phonebook\n"+
								   	"5 Show All Persons\n"+
									"9 Exit");

				selection = ScrInt.nextInt();
				MainMenu(selection);

			} while (selection != 9);


			System.out.println("Exited Program, Good Bye!");
		}

		public static void MainMenu(int key)
		{
			int arrayPos = -1;
			switch (key)
			{
			case 1:// Add a Person to the Phone Book
				System.out.println(" ");
				Person person = new Person(AddUser());
				CpyExpandPerson(person);
				System.out.println(" ");
				break;
			case 2:// Delete Phone Book entry
				arrayPos = SelectPerson();
				DeletePerson(arrayPos);
				break;
			case 3:// Update Phone Book entries
				arrayPos = SelectPerson();
				UpdateMenu(arrayPos);
				break;
			case 4:// Search Phone Book entries
				SearchMenu(arrayPos);
			case 5://List of all entries in the phone Book
				ShowAllPersons();
				break;
				
			case 9:// Exit

				break;
				
			default:
				System.out.println("Your selection is invald, please try again...");
			}

		}
		
		public static void UpdateMenu(int arrayPos)
		{


			do
			{
				System.out.println("Please select from the following activities:");

				System.out.println(	"1 Update the Person's First Name\n" +
									"2 Update the Person's Middle Name\n"+
									"3 Update the Person's Last Name\n" +
									"4 Update the Person's Telephone Number\n" +
									"5 Update the Person's Street\n" +
									"6 Update the Person's City\n" +
									"7 Update the Person's State\n" +
									"8 Update the Person's Zip Code\n" +
									"9 Exit the Person's Update Menu");

				updateSelection = ScrInt.nextInt();
				UpdateMenu(updateSelection, arrayPos);

			} while (updateSelection != 9);


			System.out.println("Exiting Update Menu, Returing to the Main Menu");
		}
		
		
		public static void UpdateMenu(int key, int arrayPos)
		{
			
			switch (key)
			{
			case 1:// Update First Name
				System.out.println(" ");
				String updatedString = NewUpdateString();
				persons[arrayPos].setFirstName(updatedString);
				System.out.println(" ");
				System.out.println(persons[arrayPos].toString());
				break;
			case 2:// Update Middle Name
				System.out.println(" ");
				updatedString = NewUpdateString();
				persons[arrayPos].setMiddleName(updatedString);
				System.out.println(" ");
				System.out.println(persons[arrayPos].toString());
				break;
			case 3:// Update Last Name
				System.out.println(" ");
				updatedString = NewUpdateString();
				persons[arrayPos].setLastName(updatedString);
				System.out.println(" ");
				System.out.println(persons[arrayPos].toString());
				break;
			case 4:// Update Telephone Number
				System.out.println(" ");
				updatedString = NewUpdateString();
				persons[arrayPos].setPhoneNumber(updatedString);
				System.out.println(" ");
				System.out.println(persons[arrayPos].toString());
				break;
			case 5:// Update Street
				System.out.println(" ");
				updatedString = NewUpdateString();
				persons[arrayPos].getAddress().setStreetAddress(updatedString);
				System.out.println(" ");
				System.out.println(persons[arrayPos].toString());
				break;
			case 6:// Update City
				System.out.println(" ");
				updatedString = NewUpdateString();
				persons[arrayPos].getAddress().setCity(updatedString);
				System.out.println(" ");
				System.out.println(persons[arrayPos].toString());
				break;
			case 7:// Update State
				System.out.println(" ");
				updatedString = NewUpdateString();
				persons[arrayPos].getAddress().setState(updatedString);
				System.out.println(" ");
				System.out.println(persons[arrayPos].toString());
				break;
			case 8:// Update Zip
				System.out.println(" ");
				updatedString = NewUpdateString();
				persons[arrayPos].getAddress().setZipCode(updatedString);
				System.out.println(" ");
				System.out.println(persons[arrayPos].toString());
				break;
			case 9:// Exit

				break;
				
			default:
				System.out.println("Your selection is invald, please try again...");
			}

		}
		
		public static void SearchMenu(int arrayPos)
		{


			do
			{
				System.out.println("Please select from the following search activities:");

				System.out.println(	"1 Search by Person's First Name\n" +
									"2 Search by Person's Last Name\n" +
									"3 Search by Person's Full Name\n"+
									"4 Search by Person's Telephone Number\n" +
									"5 Search by Person's City\n" +
									"6 Search by Person's State\n" +
									"9 Exit the Update Menu");

				searchSelection = ScrInt.nextInt();
				SearchMenu(searchSelection, arrayPos);

			} while (searchSelection != 9);


			System.out.println("Exiting Search Menu Program, Thank you!");
		}
		
		
		public static void SearchMenu(int key, int arrayPos)
		{
			
			switch (key)
			{
			case 1:// Search First Name
				System.out.println(" ");
				String searchString = SearchString();
				SrchFirstName(searchString);
				System.out.println(" ");
				break;
			case 2:// Search Last Name
				System.out.println(" ");
				searchString = SearchString();
				SrchLastName(searchString);
				System.out.println(" ");
				break;
			case 3:// Search Full Name
				System.out.println(" ");
				searchString = SearchString();
				SrchCity(searchString);
				System.out.println(" ");
				break;
			case 4:// Search Telephone Number
				System.out.println(" ");
				searchString = SearchString();
				SrchPhoneNumber(searchString);
				System.out.println(" ");
				break;
			case 5:// Search City
				System.out.println(" ");
				searchString = SearchString();
				SrchState(searchString);
				System.out.println(" ");
				break;
			case 6:// Search State
				System.out.println(" ");
				searchString = SearchString();
				SrchState(searchString);
				System.out.println(" ");
				break;
			case 9:// Exit

				break;
				
			default:
				System.out.println("Your selection is invald, please try again...");
			}

		}
		
		public static String AddUser()
		{
			String addUserString = "";

			System.out.println("Please enter the string per the example below:");
			System.out.println("   example: John Michael West Doe, 574 Pole ave, St. Peters, MO, 63333, 5628592375");
			addUserString = ScrLine.nextLine();

			
			return addUserString;
		}
		
		public static String NewUpdateString()
		{
			String updatedString = "";
			System.out.println("Please enter the value you wish it changed to: ");
			updatedString = ScrLine.nextLine();

			return updatedString;
			
		}
		
		public static String SearchString()
		{
			String searchString = "";
			System.out.println("Please enter the value you wish to search on: ");
			searchString = ScrLine.nextLine();

			return searchString;
			
		}
		
		public static void CpyExpandPerson(Person person)
		{
			Person[] tempArray = new Person[persons.length+1];
			for(int i=0;i<persons.length;i++)
			{
				tempArray[i]=persons[i];
			}
			tempArray[tempArray.length-1] = person;
			persons = tempArray;
			
			System.out.print("Added to Phone Book: ");
			System.out.print(person.toString());
			System.out.println();
			
		}
		
		public static void ShowAllPersons()
		{
			System.out.println(" ");
			System.out.println("***Phonebook Person List***");
//			Person[] persons1 = persons;
// 			Arrays.sort(persons);
			for (int i = 0; i < persons.length; i++)
			{
				System.out.println((i+1)+". "+persons[i].toString());
			}
			System.out.println(" ");
		}
		
		public static int SelectPerson()
		{
			int personsarrayindexvalue = -1;
			String telephone = "";
			ShowAllPersons();

			System.out.println(" ");
			System.out.println("Please enter the phone number for the person you wish to select:");
			telephone = ScrLine.nextLine();
			
			for (int i = 0; i < persons.length; i++)
			{
				if(telephone.equals(persons[i].getPhoneNumber())) 
					{personsarrayindexvalue=i;}
			}
			return personsarrayindexvalue;
			
		}
		
		public static void DeletePerson(int arrayPos)

		{
			Person[] tempArray = new Person[persons.length-1];
			for(int i=0;i<persons.length;i++)
			{
				if(i<arrayPos)
					{
					tempArray[i]=persons[i];
					}
				if(i>arrayPos)
				{
				tempArray[i-1]=persons[i];
				}
			}
			persons = tempArray;
			
			System.out.print("Person Deleted from Phone Book ");
			ShowAllPersons();
			System.out.println(" ");
			
		}
		
		public static void SrchFirstName(String string)
		{
			int counter =0;
			for(int i=0;i<persons.length;i++)
			{
				
				if(persons[i].getFirstName().toLowerCase().startsWith(string.toLowerCase()))
				{
					System.out.println(persons[i].toString());
					counter +=1;
				}
			}
			if(counter==0)
			{
				System.out.println("Sorry no matching results were found");
			}
		}
		
		public static void SrchLastName(String string)
		{
			int counter =0;
			for(int i=0;i<persons.length;i++)
			{
				
				if(persons[i].getLastName().toLowerCase().startsWith(string.toLowerCase()))
				{
					System.out.println(persons[i].toString());
					counter +=1;
				}
			}
			if(counter==0)
			{
				System.out.println("Sorry no matching results were found");
			}
		}
		
		public static void SrchFullName(String string)
		{
			int counter =0;
			for(int i=0;i<persons.length;i++)
			{
				
				if(persons[i].getFullName().toLowerCase().contains(string.toLowerCase()))
				{
					System.out.println(persons[i].toString());
					counter +=1;
				}
			}
			if(counter==0)
			{
				System.out.println("Sorry no matching results were found");
			}
		}
		
		public static void SrchPhoneNumber(String string)
		{
			int counter =0;
			for(int i=0;i<persons.length;i++)
			{
				
				if(persons[i].getPhoneNumber().toLowerCase().contains(string.toLowerCase()))
				{
					System.out.println(persons[i].toString());
					counter +=1;
				}
			}
			if(counter==0)
			{
				System.out.println("Sorry no matching results were found");
			}
		}
		
		public static void SrchCity(String string)
		{
			int counter =0;
			for(int i=0;i<persons.length;i++)
			{
				
				if(persons[i].getAddress().getCity().toLowerCase().contains(string.toLowerCase()))
				{
					System.out.println(persons[i].toString());
					counter +=1;
				}
			}
			if(counter==0)
			{
				System.out.println("Sorry no matching results were found");
			}
		}
		
		public static void SrchState(String string)
		{
			int counter =0;
			for(int i=0;i<persons.length;i++)
			{
				
				if(persons[i].getAddress().getState().toLowerCase().contains(string.toLowerCase()))
				{
					System.out.println(persons[i].toString());
					counter +=1;
				}
			}
			if(counter==0)
			{
				System.out.println("Sorry no matching results were found");
			}
		}

		public static String getUpdatedString()
		{
			return updatedString;
		}

		public static void setUpdatedString(String updatedString)
		{
			PhoneBookApp.updatedString = updatedString;
		}
	}

