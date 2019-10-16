package phoneBook;

public class Person extends Address
{
	protected int uniquedId = 1;
	protected String address;
	protected String firstName;
	protected String middleName;
	protected String lastName;
	protected String phoneNumber;
	
	
    public Person()
    {
    	
    	
    }
	
    public Person(int uniquedId, String firstName, String middleName, String lastName, String phoneNumber, String address)
    {
    	this.address = address;
    	this.firstName = firstName;
    	this.middleName = middleName;
    	this.lastName = lastName;
    	this.phoneNumber = phoneNumber;
    	this.uniquedId = uniquedId;
    	uniquedId = uniquedId + 1;
    	 }
	
   
    
//Override

    @Override
    		public String toString()
    		{
    		String areaCode = phoneNumber.substring(0,4); 
    		String excNumber = phoneNumber.substring(4,7);
    		String number = phoneNumber.substring(7);
    		String formatPhoneNumber = "(" + areaCode + ")-" + excNumber + "-" + number;
   
    	
    	
    	
    			return "\nUniqued Id: " + uniquedId + 
    				   "\nFirst Name: " + firstName +
    			       "\nMiddle Name: " + middleName + 
    			       "\nLast Name: " + lastName +
    			       "\nPhone Number: " + formatPhoneNumber +
    				   "\nAddress: " + address + 
    				   "\n";
    		}
	
	
	
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
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
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	public int getUniquedId()
	{
		return uniquedId;
	}
	public void setUniquedId(int uniquedId)
	{
		this.uniquedId = uniquedId;
	}
	
}