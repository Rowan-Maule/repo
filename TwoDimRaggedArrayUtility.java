//Class: CMSC203 CRN 33083
//Program: Assignment #5
//Instructor: Khandan Moshi
//Summary of Description: TwoDimRaggedArrayUtility reads a ragged array from a file and calculates highest and lowest values and totals of the rows and columns.  HolidayBonus uses the array and methods from TwoDimRaggedArrayUtility to calculate the holiday bonus for each store and total holiday bonus.
//Due Date: 4/2/2025
//Integrity Pledge: I pledge that I have completed the programming assignment independently.
//I have not copied the code from a student or any source.
//Student Name: Rowan Maule

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {
	private final static int MAX_ROW = 10;
	private final static int MAX_COLUMN = 10;
	
	public static double[][] readFile(File file) throws FileNotFoundException
	{
		Scanner fileReader = new Scanner(file);
		String[][] tempArray = new String[MAX_ROW][MAX_COLUMN];
		
		//temp array of strings
		int rows = 0;
		while(fileReader.hasNextLine())
		{
			String currLine = fileReader.nextLine();
			String[] currLineArray = currLine.split(" ");
			
			for(int cols = 0; cols < currLineArray.length; cols++)
			{
				tempArray[rows][cols] = currLineArray[cols];
			}
			rows++;
		}
		fileReader.close();
		
		
		//finds # of rows
		int rowCounter = 0;
		
		for(int rowNum = 0; rowNum < MAX_ROW; rowNum++)
		{
			if(tempArray[rowNum][0] != null)
			{
				rowCounter++;
			}
		}
		double[][] twoDimRaggedArray = new double[rowCounter][];
		
		//finds # of columns per row
		for(int r = 0; r < rowCounter; r++)
		{
			int colCounter = 0;
			
			for(int c = 0; c < MAX_COLUMN; c++)
			{
				if(tempArray[r][c] != null)
				{
					colCounter++;
				}
			}
			
			twoDimRaggedArray[r] = new double[colCounter];
		}
		
		//fills array with the values from tempArray
		for(int rowCount = 0; rowCount < twoDimRaggedArray.length; rowCount++)
		{
			for(int colCount = 0; colCount < twoDimRaggedArray[rowCount].length; colCount++)
			{
				twoDimRaggedArray[rowCount][colCount] = Double.parseDouble(tempArray[rowCount][colCount]);
			}
		}
		
		return twoDimRaggedArray;
	}
	
	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException
	{
		PrintWriter fileWrite = new PrintWriter(outputFile);
		
		for(int row = 0; row < data.length; row++)
		{
			for(int col = 0; col < data[row].length; col++)
			{
				fileWrite.print(data[row][col]);
				if(col + 1 != data.length)
				{
					fileWrite.print(" ");
				}
			}
			if(row + 1 != data.length)
			{
				fileWrite.println();
			}
		}
		fileWrite.close();
	}
	
	public static double getTotal(double[][] data)
	{
		double total = 0;
		
		for(int row = 0; row < data.length; row++)
		{
			for(int col = 0; col < data[row].length; col++)
			{
				total += data[row][col];
			}
		}
		
		return total;
	}
	
	public static double getAverage(double[][] data)
	{
		double average = 0;
		double numElements = 0;
		
		for(int row = 0; row < data.length; row++)
		{
			for(int col = 0; col < data[row].length; col++)
			{
				average += data[row][col];
				numElements++;
			}
		}
		
		average /= numElements;
		
		return average;
	}
	
	public static double getRowTotal(double[][] data, int row)
	{
		double total = 0;
		
		for(int col = 0; col < data[row].length; col++)
		{
			total += data[row][col];
		}
		
		return total;
	}
	
	public static double getColumnTotal(double[][] data, int col)
	{
		double total = 0;
		
		for(int row = 0; row < data.length; row++)
		{
			if(!(col + 1 > data[row].length))
			{
				total += data[row][col];
			}
		}
		
		return total;
	}
	
	public static double getHighestInRow(double[][] data, int row)
	{
		double highest = 0;
		
		for(int col = 0; col < data[row].length; col++)
		{
			if(data[row][col] > highest)
			{
				highest = data[row][col];
			}
		}
		
		return highest;
	}
	
	public static int getHighestInRowIndex(double[][] data, int row)
	{
		int highestIndex = 0;
		
		double highest = 0;
		
		for(int col = 0; col < data[row].length; col++)
		{
			if(data[row][col] > highest)
			{
				highest = data[row][col];
				highestIndex = col;
			}
		}
		
		return highestIndex;
	}
	
	public static double getLowestInRow(double[][] data, int row)
	{
		double lowest = 2000000000;
		
		for(int col = 0; col < data[row].length; col++)
		{
			if(data[row][col] < lowest)
			{
				lowest = data[row][col];
			}
		}
		
		return lowest;
	}
	
	public static int getLowestInRowIndex(double[][] data, int row)
	{
		int lowestIndex = 0;
		double lowest = 2000000000;
		
		for(int col = 0; col < data[row].length; col++)
		{
			if(data[row][col] < lowest)
			{
				lowest = data[row][col];
				lowestIndex = col;
			}
		}
		
		return lowestIndex;
	}
	
	public static double getHighestInColumn(double[][] data, int col)
	{
		double highest = 0;
		
		for(int row = 0; row < data.length; row++)
		{
			if(data[row].length > col)
			{
				if(data[row][col] > highest)
				{
					highest = data[row][col];
				}
			}
		}
		
		return highest;
	}
	
	public static int getHighestInColumnIndex(double[][] data, int col)
	{
		int highestIndex = 0;
		
		double highest = 0;
		
		for(int row = 0; row < data.length; row++)
		{
			if(data[row].length > col)
			{
				if(data[row][col] > highest)
				{
					highest = data[row][col];
					highestIndex = row;
				}
			}
		}
		
		return highestIndex;
	}
	
	public static double getLowestInColumn(double[][] data, int col)
	{
		double lowest = 2000000000;
		
		for(int row = 0; row < data.length; row++)
		{
			if(data[row].length > col)
			{
				if(data[row].length > col)
				{
					if(data[row][col] < lowest)
					{
						lowest = data[row][col];
					}
				}
			}
		}
		
		return lowest;
	}
	
	public static int getLowestInColumnIndex(double[][] data, int col)
	{
		int lowestIndex = 0;
		double lowest = 2000000000;
		
		for(int row = 0; row < data.length; row++)
		{
			if(data[row].length > col)
			{
				if(data[row][col] < lowest)
				{
					lowest = data[row][col];
					lowestIndex = row;
				}
			}
		}
		
		return lowestIndex;
	}
	
	public static double getHighestInArray(double[][] data)
	{
		double highest = 0;
		
		for(int row = 0; row < data.length; row++)
		{
			for(int col = 0; col < data[row].length; col++)
			{
				if(data[row][col] > highest)
				{
					highest = data[row][col];
				}
			}
		}
		
		return highest;
	}
	
	public static double getLowestInArray(double[][] data)
	{
		double lowest = data[0][0];
		
		for(int row = 0; row < data.length; row++)
		{
			for(int col = 0; col < data[row].length; col++)
			{
				if(lowest > data[row][col])
				{
					lowest = data[row][col];
				}
			}
		}
		
		return lowest;
	}
}