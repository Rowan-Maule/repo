//Class: CMSC203 CRN 33083
//Program: Assignment #4
//Instructor: Khandan Monshi
//Summary of Description: The plot class creates a plot at an (x, y) coordinate and sets its width and depth.  The property class associates a plot with a name, city, rent amount, and owner. 
//Due Date: 04/23/2025
//Integrity Pledge: I pledge that I have completed the programming assignment independently.
//I have not copied the code from a student or any source.

public class Property {
	private String propertyName;
	private String city;
	private double rentAmount;
	private String owner;
	private Plot plot;
	
	public Property()
	{
		this.propertyName = "";
		this.city = "";
		this.owner = "";
		this.plot = new Plot();
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot();
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot(x, y, width, depth);
	}
	
	public Property(Property otherProperty)
	{
		this(otherProperty.propertyName, otherProperty.city, otherProperty.rentAmount, otherProperty.owner, otherProperty.plot.getX(), otherProperty.plot.getY(), otherProperty.plot.getWidth(), otherProperty.plot.getDepth());
	}
	
	public Plot getPlot()
	{
		return plot;
	}
	
	public String getPropertyName()
	{
		return propertyName;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public double getRentAmount()
	{
		return rentAmount;
	}
	
	public String getOwner()
	{
		return owner;
	}
	
	@Override
	public String toString()
	{
		return (propertyName + "," + city + "," + owner + "," + rentAmount);
	}
}
