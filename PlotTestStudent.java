//Class: CMSC203 CRN 33083
//Program: Assignment #4
//Instructor: Khandan Monshi
//Summary of Description: The plot class creates a plot at an (x, y) coordinate and sets its width and depth.  The property class associates a plot with a name, city, rent amount, and owner. 
//Due Date: 04/23/2025
//Integrity Pledge: I pledge that I have completed the programming assignment independently.
//I have not copied the code from a student or any source.

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlotTestStudent {
	//some plots to test with
	Plot plot1 = new Plot(2, 3, 3, 3);
	Plot plot2 = new Plot(6, 5, 3, 3);
	Plot plot3 = new Plot(4, 4, 5, 5);
	Plot plot4 = new Plot(5, 5, 2, 2);
	Plot plot5 = new Plot(4, 4, 2, 2);
	Plot plot6 = new Plot(4, 4, 3, 2);
	Plot plot7 = new Plot(6, 3, 6, 3);
	Plot plot8 = new Plot(6 ,6 ,3 ,4);
	Plot plot9 = new Plot(9 ,6 ,1 ,4);
	
	@Test
	void testPlot() {
		Plot plotEmpty = new Plot();
		assertEquals(1, plotEmpty.getDepth());
		assertEquals(1, plotEmpty.getWidth());
	}

	@Test
	void testPlotIntIntIntInt() {
		Plot intintintintPlot = new Plot(1, 2, 3, 4);
		assertEquals(1, intintintintPlot.getX());
		assertEquals(2, intintintintPlot.getY());
		assertEquals(3, intintintintPlot.getWidth());
		assertEquals(4, intintintintPlot.getDepth());
	}

	@Test
	void testPlotPlot() {
		assertEquals(new Plot(plot1).getX(), plot1.getX());
		assertEquals(new Plot(plot1).getY(), plot1.getY());
		assertEquals(new Plot(plot1).getWidth(), plot1.getWidth());
		assertEquals(new Plot(plot1).getDepth(), plot1.getDepth());

	}

	@Test
	void testOverlaps() {
		assertTrue(plot5.overlaps(plot6));
		assertTrue(plot6.overlaps(plot7));
		assertTrue(plot2.overlaps(plot3));
		assertFalse(plot1.overlaps(plot2));
		assertFalse(plot1.overlaps(plot7));
		assertFalse(plot8.overlaps(plot9));
	}

	@Test
	void testEncompasses() {
		assertTrue(plot3.encompasses(plot4));
		assertTrue(plot3.encompasses(plot3));
		assertTrue(plot6.encompasses(plot5));
		assertFalse(plot1.overlaps(plot2));
		assertFalse(plot1.overlaps(plot7));
		assertFalse(plot8.overlaps(plot9));
	}

	@Test
	void testSetX() {
		Plot setTest = new Plot(1, 1, 1, 1);
		setTest.setX(5);
		assertEquals(5, setTest.getX());
	}

	@Test
	void testSetY() {
		Plot setTest = new Plot(1, 1, 1, 1);
		setTest.setY(5);
		assertEquals(5, setTest.getY());
	}

	@Test
	void testSetWidth() {
		Plot setTest = new Plot(1, 1, 1, 1);
		setTest.setWidth(5);
		assertEquals(5, setTest.getWidth());
	}

	@Test
	void testSetDepth() {
		Plot setTest = new Plot(1, 1, 1, 1);
		setTest.setDepth(5);
		assertEquals(5, setTest.getDepth());
	}

	@Test
	void testGetX() {
		assertEquals(2, plot1.getX());
	}

	@Test
	void testGetY() {
		assertEquals(3, plot1.getY());
	}

	@Test
	void testGetWidth() {
		assertEquals(3, plot1.getWidth());
	}

	@Test
	void testGetDepth() {
		assertEquals(3, plot1.getDepth());
	}

	@Test
	void testToString() {
		assertEquals("2,3,3,3", plot1.toString());
		assertEquals("9,6,1,4", plot9.toString());
	}

}
