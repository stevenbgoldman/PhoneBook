package phoneBook;

public class Person extends Address
{
	protected String firstName;
	protected String middleName;
	protected String lastName;
	protected String fullName;
	protected String phoneNumber;
	protected Address address;
	
    public Person()
    {
    	
    	
    }
	
    public Person(String string)
    {
    	String[] splitValues = string.split(",");
		
		String[] namefields = splitValues[0].split(" ");
				for (int i = 0; i < namefields.length; i++)
				{
					if(i == 0) {this.firstName = namefields[i];}
					if(i>0 && i <namefields.length-1) {this.middleName += " "+namefields[i];}
					if(i==namefields.length-1) {this.lastName =namefields[i];}

				}
				this.middleName = this.middleName.strip();
				
		Address a = new Address(splitValues[1].strip(),
								splitValues[2].strip(),
								splitValues[3].strip(),
								splitValues[4].strip());
		this.address=a;
		
		this.phoneNumber = splitValues[5].strip();
     }
	
    
    
//Override

    @Override
    		public String toString()
    		{
    		String areaCode = phoneNumber.substring(0,3); 
    		String excNumber = phoneNumber.substring(3,6);
    		String number = phoneNumber.substring(6);
    		String formatPhoneNumber = "(" + areaCode + ")-" + excNumber + "-" + number;
   
    	
    	
    	
    			return "\nFirst Name: " + firstName +
    			       "\nMiddle Name: " + middleName + 
    			       "\nLast Name: " + lastName +
    			       "\nPhone Number: " + formatPhoneNumber +
    			       "\nAddress: " + address + 
    				   "\n";
    		}
	
	
	
	public Address getAddress()
	{
		return address;
	}
	public void setAddress(Address address)
	{
		this.address = address;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getMiddleName()
	{
		return middleName;
	}
	public void setMiddleName(String middleName)
	{
		this.middleName = middleName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public String getFullName()
	{
		fullName = firstName + " " + middleName + " " + lastName;
		return fullName;
	}
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	
	
}