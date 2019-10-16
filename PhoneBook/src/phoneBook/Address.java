package phoneBook;

public class Address
{
	private String streetAddress;
	private String city;
	private String state;
	private int zipCode;
	
	
	public Address() 
	{
				
	}

	public Address(String streetAddress, String city, String state, int zipCode)
	{
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		
	}
	
//Override

@Override
		public String toString()
		{
			return "\nStreet Address: " + streetAddress + 
				   "\nCity: " + city +
			       "\nState: " + state + 
				   "\nZip Code: " + zipCode + 
				   "\n";
		}

//Setters and Getters
		
	public String getStreetAddress()
	{
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress)
	{
		this.streetAddress = streetAddress;
	}
	public String getCity()
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public String getState()
	{
		return state;
	}
	public void setState(String state)
	{
		this.state = state;
	}
	public int getZipCode()
	{
		return zipCode;
	}
	public void setZipCode(int zipCode)
	{
		this.zipCode = zipCode;
	}
	
}
