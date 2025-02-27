/*
 * Class: CMSC203 
 * Instructor: Khandan Moshi
 * Description: Creates object for info for each procedure
 * Due: 2/26/2025
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Rowan Maule
*/

public class Procedure 
{
	private String procedureName;
	private String procedureDate;
	private String practicionerName;
	private double charges;
	
	//no arg constructor
	public Procedure()
	{
		this.procedureName = "";
		this.procedureDate = "";
		this.practicionerName = "";
		this.charges = 0;
	}
	
	//procedure name and date constructor
	public Procedure(String procedureName, String procedureDate)
	{
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
	}
	
	//all procedure attribute constructor
	public Procedure(String procedureName, String procedureDate, String practicionerName, double charges)
	{
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
		this.practicionerName = practicionerName;
		this.charges = charges;
	}
	
	//accessors
	public String getProcedureName()
	{
		return procedureName;
	}
	
	public String getProcedureDate()
	{
		return procedureDate;
	}
	
	public String getPracticionerName()
	{
		return practicionerName;
	}
	
	public double getCharges()
	{
		return charges;
	}
	
	//mutators
	public void setProcedureName(String procedureName)
	{
		this.procedureName = procedureName;
	}
	
	public void setProcedureDate(String procedureDate)
	{
		this.procedureDate = procedureDate;
	}
	
	public void setPracticionerName(String practicionerName)
	{
		this.practicionerName = practicionerName;
	}
	
	public void setCharges(double charges)
	{
		this.charges = charges;
	}
	
	//toString to display all procedures
	public String toString()
	{
		return ("	Procedure: " + this.procedureName + "\n" + "	Procedure Date: " + this.procedureDate + "\n" + "	Practicioner: " + this.practicionerName + "\n" + "	Charges: " + this.charges);
	}
}
