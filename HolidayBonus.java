//Class: CMSC203 CRN 33083
//Program: Assignment #5
//Instructor: Khandan Moshi
//Summary of Description: TwoDimRaggedArrayUtility reads a ragged array from a file and calculates highest and lowest values and totals of the rows and columns.  HolidayBonus uses the array and methods from TwoDimRaggedArrayUtility to calculate the holiday bonus for each store and total holiday bonus.
//Due Date: 4/2/2025
//Integrity Pledge: I pledge that I have completed the programming assignment independently.
//I have not copied the code from a student or any source.
//Student Name: Rowan Maule

public class HolidayBonus {
	public static double[] calculateHolidayBonus(double[][] data)
	{
		//finds the number of stores needed for holidayBonus
		int stores = data.length;
		
		double[] holidayBonus = new double[stores];
		
		//adds $2000 to each store for each section with any sales
		for(int store = 0; store < stores; store++)
		{
			for(int category = 0; category < data[store].length; category++)
			{
				holidayBonus[store] += 2000;
			}
		}
		
		//adds to holiday bonuses for each store based on highest/lowest sales
		//checks for store with most categories of things sold
		int longestCategory = 0;
		for(int row = 0; row < data.length; row++)
		{
			for(int col = 0; col < data[row].length; col++)
			{
				if(longestCategory < col)
				{
					longestCategory = col;
				}
			}
		}
		
		//adds for most sold in each category
		for(int most = 0; most < longestCategory + 1; most++)
		{
			int index = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, most);
			holidayBonus[index] += 3000;
		}
		
		//subtracts for least sold in each category
		for(int least = 0; least < longestCategory + 1; least++)
		{
			int index = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, least);
			holidayBonus[index] -= 1000;
		}
		
		return holidayBonus;
	}
	
	public static double calculateTotalHolidayBonus(double[][] data)
	{
		double totalBonus = 0;
		
		//finds the number of stores needed for holidayBonus
		int stores = data.length;
		
		double[] holidayBonus = new double[stores];
				
		//adds $2000 to each store for each section with any sales
		for(int store = 0; store < stores; store++)
		{
			for(int category = 0; category < data[store].length; category++)
			{
				holidayBonus[store] += 2000;
			}
		}
		
		//adds to holiday bonuses for each store based on highest/lowest sales
		//checks for store with most categories of things sold
		int longestCategory = 0;
		for(int row = 0; row < data.length; row++)
		{
			for(int col = 0; col < data[row].length; col++)
			{
				if(longestCategory < col)
				{
					longestCategory = col;
				}
			}
		}
				
		//adds for most sold in each category
		for(int most = 0; most < longestCategory + 1; most++)
		{
			int index = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, most);
			holidayBonus[index] += 3000;
		}
				
		//subtracts for least sold in each category
		for(int least = 0; least < longestCategory + 1; least++)
		{
			int index = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, least);
			holidayBonus[index] -= 1000;
		}
						
		for(int rowrow = 0; rowrow < data.length; rowrow++)
		{
			totalBonus += holidayBonus[rowrow];
		}
		
		return totalBonus;
	}
}
