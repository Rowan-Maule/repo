//Class: CMSC203 CRN 33083
//Program: Assignment #5
//Instructor: Khandan Moshi
//Summary of Description: TwoDimRaggedArrayUtility reads a ragged array from a file and calculates highest and lowest values and totals of the rows and columns.  HolidayBonus uses the array and methods from TwoDimRaggedArrayUtility to calculate the holiday bonus for each store and total holiday bonus.
//Due Date: 4/2/2025
//Integrity Pledge: I pledge that I have completed the programming assignment independently.
//I have not copied the code from a student or any source.
//Student Name: Rowan Maule

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class TwoDimRaggedArrayUtilityTestStudent {
	private double[][] data1 = {{4, 3, 2},
								{-5, -3},
								{-4, 15, 22, 9, 5}, 
								{4, 8, 7, 2}};
	
	private double[][]data2 = {{-2, -5, -7, 2.9, 203},
							   {-504.2, -294, 1.1},
							   {-5, 587, -302},
							   {1}};
	
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	void testGetTotal() {
		assertEquals(69, TwoDimRaggedArrayUtility.getTotal(data1), 0.001);
		assertEquals(-324.2, TwoDimRaggedArrayUtility.getTotal(data2), 0.001);
	}

	@Test
	void testGetAverage() {
		assertEquals(4.928, TwoDimRaggedArrayUtility.getAverage(data1), 0.001);
		assertEquals(-27.017, TwoDimRaggedArrayUtility.getAverage(data2), 0.001);
	}

	@Test
	void testGetRowTotal() {
		assertEquals(47, TwoDimRaggedArrayUtility.getRowTotal(data1, 2), 0.001);
		assertEquals(280, TwoDimRaggedArrayUtility.getRowTotal(data2, 2), 0.001);
	}

	@Test
	void testGetColumnTotal() {
		assertEquals(23, TwoDimRaggedArrayUtility.getColumnTotal(data1, 1), 0.001);
		assertEquals(2.9, TwoDimRaggedArrayUtility.getColumnTotal(data2, 3), 0.001);	
	}

	@Test
	void testGetHighestInRow() {
		assertEquals(0, TwoDimRaggedArrayUtility.getHighestInRow(data1, 1), 0.001);
		assertEquals(1, TwoDimRaggedArrayUtility.getHighestInRow(data2, 3), 0.001);	
	}

	@Test
	void testGetHighestInRowIndex() {
		assertEquals(0, TwoDimRaggedArrayUtility.getHighestInRowIndex(data1, 1), 0.001);
		assertEquals(0, TwoDimRaggedArrayUtility.getHighestInRowIndex(data2, 3), 0.001);	
	}

	@Test
	void testGetLowestInRow() {
		assertEquals(2, TwoDimRaggedArrayUtility.getLowestInRow(data1, 0), 0.001);
		assertEquals(1, TwoDimRaggedArrayUtility.getLowestInRow(data2, 3), 0.001);
	}

	@Test
	void testGetLowestInRowIndex() {
		assertEquals(2, TwoDimRaggedArrayUtility.getLowestInRowIndex(data1, 0), 0.001);
		assertEquals(0, TwoDimRaggedArrayUtility.getLowestInRowIndex(data2, 3), 0.001);
	}

	@Test
	void testGetHighestInColumn() {
		assertEquals(4, TwoDimRaggedArrayUtility.getHighestInColumn(data1, 0), 0.001);
		assertEquals(2.9, TwoDimRaggedArrayUtility.getHighestInColumn(data2, 3), 0.001);
	}

	@Test
	void testGetHighestInColumnIndex() {
		assertEquals(0, TwoDimRaggedArrayUtility.getHighestInColumnIndex(data1, 0), 0.001);
		assertEquals(0, TwoDimRaggedArrayUtility.getHighestInColumnIndex(data2, 3), 0.001);
	}

	@Test
	void testGetLowestInColumn() {
		assertEquals(-5, TwoDimRaggedArrayUtility.getLowestInColumn(data1, 0), 0.001);
		assertEquals(2.9, TwoDimRaggedArrayUtility.getLowestInColumn(data2, 3), 0.001);
	}

	@Test
	void testGetLowestInColumnIndex() {
		assertEquals(1, TwoDimRaggedArrayUtility.getLowestInColumnIndex(data1, 0), 0.001);
		assertEquals(0, TwoDimRaggedArrayUtility.getLowestInColumnIndex(data2, 3), 0.001);
	}

	@Test
	void testGetHighestInArray() {
		assertEquals(22, TwoDimRaggedArrayUtility.getHighestInArray(data1), 0.001);
		assertEquals(587, TwoDimRaggedArrayUtility.getHighestInArray(data2), 0.001);
	}

	@Test
	void testGetLowestInArray() {
		assertEquals(-5, TwoDimRaggedArrayUtility.getLowestInArray(data1), 0.001);
		assertEquals(-504.2, TwoDimRaggedArrayUtility.getLowestInArray(data2), 0.001);
	}

}
