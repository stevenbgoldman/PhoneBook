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
				MainMenuy(selection);

			} while (selection != 9);


			System.out.println("Exited Program, Good Bye!");
		}

		public static void MainMenuy(int key)
		{
			int arrayposition = -1;
			switch (key)
			{
			case 1:// Add a Person to the Phone Book
				System.out.println(" ");
				Person person = new Person(AddUserString());
				CpyExpandPerson(person);
				System.out.println(" ");
				break;
			case 2:// Delete Phone Book entry
				arrayposition = SelectPerson();
				DeletePersonFromPhoneBook(arrayposition);
				break;
			case 3:// Update Phone Book entries
				arrayposition = SelectPerson();
				UpdateMenuLoop(arrayposition);
				break;
			case 4:// Search Phone Book entries
				SearchMenuLoop(arrayposition);
			case 5://List of all entries in the phone Book
				ShowAllPersons();
				break;
				
			case 9:// Exit

				break;
				
			default:
				System.out.println("Your selection is invald, please try again...");
			}

		}
		
		public static void UpdateMenuLoop(int arrayposition)
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
				UpdateMenu(updateSelection, arrayposition);

			} while (updateSelection != 9);


			System.out.println("Exiting Update Menu, Returing to the Main Menu");
		}
		
		
		public static void UpdateMenu(int key, int arrayposition)
		{
			
			switch (key)
			{
			case 1:// Update First Name
				System.out.println(" ");
				String updatedString = NewUpdateString();
				persons[arrayposition].setFirstName(updatedString);
				System.out.println(" ");
				System.out.println(persons[arrayposition].toString());
				break;
			case 2:// Update Middle Name
				System.out.println(" ");
				updatedString = NewUpdateString();
				persons[arrayposition].setMiddleName(updatedString);
				System.out.println(" ");
				System.out.println(persons[arrayposition].toString());
				break;
			case 3:// Update Last Name
				System.out.println(" ");
				updatedString = NewUpdateString();
				persons[arrayposition].setLastName(updatedString);
				System.out.println(" ");
				System.out.println(persons[arrayposition].toString());
				break;
			case 4:// Update Telephone Number
				System.out.println(" ");
				updatedString = NewUpdateString();
				persons[arrayposition].setPhoneNumber(updatedString);
				System.out.println(" ");
				System.out.println(persons[arrayposition].toString());
				break;
			case 5:// Update Street
				System.out.println(" ");
				updatedString = NewUpdateString();
				persons[arrayposition].getAddress().setStreetAddress(updatedString);
				System.out.println(" ");
				System.out.println(persons[arrayposition].toString());
				break;
			case 6:// Update City
				System.out.println(" ");
				updatedString = NewUpdateString();
				persons[arrayposition].getAddress().setCity(updatedString);
				System.out.println(" ");
				System.out.println(persons[arrayposition].toString());
				break;
			case 7:// Update State
				System.out.println(" ");
				updatedString = NewUpdateString();
				persons[arrayposition].getAddress().setState(updatedString);
				System.out.println(" ");
				System.out.println(persons[arrayposition].toString());
				break;
			case 8:// Update Zip
				System.out.println(" ");
				updatedString = NewUpdateString();
				persons[arrayposition].getAddress().setZipCode(updatedString);
				System.out.println(" ");
				System.out.println(persons[arrayposition].toString());
				break;
			case 9:// Exit

				break;
				
			default:
				System.out.println("Your selection is invald, please try again...");
			}

		}
		
		public static void SearchMenuLoop(int arrayposition)
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
									"9 Exit the Person's Update Menu");

				searchSelection = ScrInt.nextInt();
				SearchMenu(searchSelection, arrayposition);

			} while (searchSelection != 9);


			System.out.println("Exiting Search Menu Program, Thank you!");
		}
		
		
		public static void SearchMenu(int key, int arrayposition)
		{
			
			switch (key)
			{
			case 1:// Search First Name
				System.out.println(" ");
				String searchString = SearchString();
				SearchbyFirstName(searchString);
				System.out.println(" ");
				break;
			case 2:// Search Last Name
				System.out.println(" ");
				searchString = SearchString();
				SearchbyLastName(searchString);
				System.out.println(" ");
				break;
			case 3:// Search Full Name
				System.out.println(" ");
				searchString = SearchString();
				SearchbyFullName(searchString);
				System.out.println(" ");
				break;
			case 4:// Search Telephone Number
				System.out.println(" ");
				searchString = SearchString();
				SearchbyPhoneNumber(searchString);
				System.out.println(" ");
				break;
			case 5:// Search City
				System.out.println(" ");
				searchString = SearchString();
				SearchbyCity(searchString);
				System.out.println(" ");
				break;
			case 6:// Search State
				System.out.println(" ");
				searchString = SearchString();
				SearchbyState(searchString);
				System.out.println(" ");
				break;
			case 9:// Exit

				break;
				
			default:
				System.out.println("Your selection is invald, please try again...");
			}

		}
		
		public static String AddUserString()
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
			Person[] newarray = new Person[persons.length+1];
			for(int i=0;i<persons.length;i++)
			{
				newarray[i]=persons[i];
			}
			newarray[newarray.length-1] = person;
			persons = newarray;
			
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
//				System.out.println(i);
//				System.out.println(persons[i].getTelephone());
//				System.out.println(telephone);
				if(telephone.equals(persons[i].getPhoneNumber())) 
					{personsarrayindexvalue=i;}
			}
			return personsarrayindexvalue;
			
		}
		
		public static void DeletePersonFromPhoneBook(int arrayposition)

		{
			Person[] newarray = new Person[persons.length-1];
			for(int i=0;i<persons.length;i++)
			{
				if(i<arrayposition)
					{
					newarray[i]=persons[i];
					}
				if(i>arrayposition)
				{
				newarray[i-1]=persons[i];
				}
			}
			persons = newarray;
			
			System.out.print("Person Deleted from Phone Book ");
			ShowAllPersons();
			System.out.println(" ");
			
		}
		
		public static void SearchbyFirstName(String string)
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
		
		public static void SearchbyLastName(String string)
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
		
		public static void SearchbyFullName(String string)
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
		
		public static void SearchbyPhoneNumber(String string)
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
		
		public static void SearchbyCity(String string)
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
		
		public static void SearchbyState(String string)
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

