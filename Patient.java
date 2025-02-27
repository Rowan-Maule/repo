/*
 * Class: CMSC203 
 * Instructor: Khandan Moshi
 * Description: Creates object for patient info
 * Due: 2/26/2025
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Rowan Maule
*/

public class Patient 
{
	private String firstName, middleName, lastName;
	private String address, city, state;
	private int zip;
	private String phone;
	private String emergencyName, emergencyPhone;
	
	
	//no arg constructor
	public Patient()
	{
		this.firstName = "";
		this.middleName = "";
		this.lastName = "";
		this.address = "";
		this.city = "";
		this.state = "";
		this.zip = 0;
		this.phone = "";
		this.emergencyName = "";
		this.emergencyPhone = "";
	}
	
	//patient name constructor
	public Patient(String firstName, String middleName, String lastName)
	{
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	
	//patient info constructor
	public Patient(String firstName, String middleName, String lastName, String address, String city, String state, int zip, String phone, String emergencyName, String emergencyPhone)
	{
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.emergencyName = emergencyName;
		this.emergencyPhone = emergencyPhone;
	}
	
	//accessors
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getMiddleName()
	{
		return middleName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public String getState()
	{
		return state;
	}
	
	public int getZip()
	{
		return zip; 
	}
	
	public String getPhone()
	{
		return phone;
	}
	
	public String getEmergencyName()
	{
		return emergencyName;
	}
	
	public String getEmergencyPhone()
	{
		return emergencyPhone;
	}
	
	//mutators
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public void setMiddleName(String middleName)
	{
		this.middleName = middleName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public void setState(String state)
	{
		this.state = state;
	}
	
	public void setZip(int zip)
	{
		this.zip = zip; 
	}
	
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	
	public void setEmergencyName(String emergencyName)
	{
		this.emergencyName = emergencyName;
	}
	
	public void setEmergencyPhone(String emergencyPhone)
	{
		this.emergencyPhone = emergencyPhone;
	}
	
	//Makes full strings
	public String buildFullName()
	{
		return (this.firstName + " " + this.middleName + " " + this.lastName);
	}
	
	public String buildAddress()
	{
		return (this.address + " " + this.city + " " + state + " " + zip);
	}
	
	public String buildEmergencyContact()
	{
		return (this.emergencyName + " " + this.emergencyPhone);
	}
	
	//toString method to display all info
	public String toString()
	{
		return ("Name: " + buildFullName() + "\n" + "Address: " + buildAddress() + "\n" + "Emergency Contact: " + buildEmergencyContact());
	}
}
