//Class: CMSC203 CRN 33083
//Program: Assignment #5
//Instructor: Khandan Moshi
//Summary of Description: TwoDimRaggedArrayUtility reads a ragged array from a file and calculates highest and lowest values and totals of the rows and columns.  HolidayBonus uses the array and methods from TwoDimRaggedArrayUtility to calculate the holiday bonus for each store and total holiday bonus.
//Due Date: 4/2/2025
//Integrity Pledge: I pledge that I have completed the programming assignment independently.
//I have not copied the code from a student or any source.
//Student Name: Rowan Maule

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HolidayBonusTestStudent {
	private double[][] data1 = {{ 4,  3, 2},
								{-5, -3},
								{-4, 15, 22, 9, 5}, 
								{ 4,  8, 7,  2}};

	private double[][]data2 = {{-2, -5, -7, 2.9, 203},
							   {-504.2, -294, 1.1},
							   {-5, 587, -302},
							   {1}};

	@Test
	void testCalculateHolidayBonus() {
		double[] arr = HolidayBonus.calculateHolidayBonus(data1);
		assertEquals(8000.0, arr[0], .001);
		assertEquals(2000, arr[1], .001);
		assertEquals(21000, arr[2], .001);
		assertEquals(7000, arr[3], .001);
		
		double[] arr2 = HolidayBonus.calculateHolidayBonus(data2);
		assertEquals(14000, arr2[0], .001);
		assertEquals(7000, arr2[1], .001);
		assertEquals(8000, arr2[2], .001);
		assertEquals(5000, arr2[3], .001);
	}

	@Test
	void testCalculateTotalHolidayBonus() {
		assertEquals(38000, HolidayBonus.calculateTotalHolidayBonus(data1), .001);
		assertEquals(34000, HolidayBonus.calculateTotalHolidayBonus(data2), .001);
	}

}
