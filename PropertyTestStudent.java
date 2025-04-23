//Class: CMSC203 CRN 33083
//Program: Assignment #4
//Instructor: Khandan Monshi
//Summary of Description: The plot class creates a plot at an (x, y) coordinate and sets its width and depth.  The property class associates a plot with a name, city, rent amount, and owner. 
//Due Date: 04/23/2025
//Integrity Pledge: I pledge that I have completed the programming assignment independently.
//I have not copied the code from a student or any source.

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PropertyTestStudent {
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
	void testProperty() {
		Property testProperty = new Property();
		assertEquals("", testProperty.getPropertyName());
		assertEquals("", testProperty.getCity());
		assertEquals("", testProperty.getOwner());
		assertEquals(1, testProperty.getPlot().getDepth());
		assertEquals(1, testProperty.getPlot().getWidth());
	}

	@Test
	void testPropertyStringStringDoubleString() {
		Property testProperty = new Property("cool house", "NYC", 1000.00, "Rowan");
		assertEquals("cool house", testProperty.getPropertyName());
		assertEquals("NYC", testProperty.getCity());
		assertEquals(1000.00, testProperty.getRentAmount());
		assertEquals("Rowan", testProperty.getOwner());
		assertEquals(1, testProperty.getPlot().getDepth());
		assertEquals(1, testProperty.getPlot().getWidth());
	}

	@Test
	void testPropertyStringStringDoubleStringIntIntIntInt() {
		Property testProperty = new Property("cool house", "NYC", 1000.00, "Rowan", 1, 2, 3, 4);
		assertEquals("cool house", testProperty.getPropertyName());
		assertEquals("NYC", testProperty.getCity());
		assertEquals(1000.00, testProperty.getRentAmount());
		assertEquals("Rowan", testProperty.getOwner());
		assertEquals(1, testProperty.getPlot().getX());
		assertEquals(2, testProperty.getPlot().getY());
		assertEquals(3, testProperty.getPlot().getWidth());
		assertEquals(4, testProperty.getPlot().getDepth());
	}

	@Test
	void testPropertyProperty() {
		Property testProperty = new Property("cool house", "NYC", 1000.00, "Rowan", 1, 2, 3, 4);
		assertEquals(new Property(testProperty).getPropertyName(), testProperty.getPropertyName());
		assertEquals(new Property(testProperty).getCity(), testProperty.getCity());
		assertEquals(new Property(testProperty).getRentAmount(), testProperty.getRentAmount());
		assertEquals(new Property(testProperty).getOwner(), testProperty.getOwner());
		assertEquals(new Property(testProperty).getPlot().getX(), testProperty.getPlot().getX());
		assertEquals(new Property(testProperty).getPlot().getY(), testProperty.getPlot().getY());
		assertEquals(new Property(testProperty).getPlot().getWidth(), testProperty.getPlot().getWidth());
		assertEquals(new Property(testProperty).getPlot().getDepth(), testProperty.getPlot().getDepth());
	}

	@Test
	void testGetPlot() {
		Property testProperty = new Property("cool house", "NYC", 1000.00, "Rowan", 1, 2, 3, 4);
		
		assertEquals("cool house", testProperty.getPropertyName());
		assertEquals("NYC", testProperty.getCity());
		assertEquals(1000.00, testProperty.getRentAmount());
		assertEquals("Rowan", testProperty.getOwner());
		assertEquals(1, testProperty.getPlot().getX());
		assertEquals(2, testProperty.getPlot().getY());
		assertEquals(3, testProperty.getPlot().getWidth());
		assertEquals(4, testProperty.getPlot().getDepth());
	}

	@Test
	void testGetPropertyName() {
		Property testProperty = new Property("cool house", "NYC", 1000.00, "Rowan", 1, 2, 3, 4);
		Property testProperty2 = new Property("building", "Gaithersburg", 9000.53, "Bob", 4, 3, 2, 1);
		
		assertEquals("cool house", testProperty.getPropertyName());
		assertEquals("building", testProperty2.getPropertyName());
	}

	@Test
	void testGetCity() {
		Property testProperty = new Property("cool house", "NYC", 1000.00, "Rowan", 1, 2, 3, 4);
		Property testProperty2 = new Property("building", "Gaithersburg", 9000.53, "Bob", 4, 3, 2, 1);
		
		assertEquals("NYC", testProperty.getCity());
		assertEquals("Gaithersburg", testProperty2.getCity());
	}

	@Test
	void testGetRentAmount() {
		Property testProperty = new Property("cool house", "NYC", 1000.00, "Rowan", 1, 2, 3, 4);
		Property testProperty2 = new Property("building", "Gaithersburg", 9000.53, "Bob", 4, 3, 2, 1);
		
		assertEquals(1000.00, testProperty.getRentAmount());
		assertEquals(9000.53, testProperty2.getRentAmount());
	}

	@Test
	void testGetOwner() {
		Property testProperty = new Property("cool house", "NYC", 1000.00, "Rowan", 1, 2, 3, 4);
		Property testProperty2 = new Property("building", "Gaithersburg", 9000.53, "Bob", 4, 3, 2, 1);
		
		assertEquals("Rowan", testProperty.getOwner());
		assertEquals("Bob", testProperty2.getOwner());
	}

	@Test
	void testToString() {
		Property testProperty = new Property("cool house", "NYC", 1000.00, "Rowan", 1, 2, 3, 4);
		Property testProperty2 = new Property("building", "Gaithersburg", 9000.53, "Bob", 4, 3, 2, 1);
		
		assertEquals("cool house,NYC,Rowan,1000.0", testProperty.toString());
		assertEquals("building,Gaithersburg,Bob,9000.53", testProperty2.toString());
	}

}
