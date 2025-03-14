
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {

	private GradeBook gradebook1;
	private GradeBook gradebook2;

	@BeforeEach
	void setUp() throws Exception {
		gradebook1 = new GradeBook(5);
		gradebook1.addScore(75);
		gradebook1.addScore(64);
		gradebook1.addScore(77);
		gradebook1.addScore(83);
		gradebook1.addScore(83);
		
		gradebook2 = new GradeBook(5);
		gradebook2.addScore(45);
		gradebook2.addScore(93);
		gradebook2.addScore(85);
		gradebook2.addScore(72);
		gradebook2.addScore(89);
	}

	@AfterEach
	void tearDown() throws Exception {
		gradebook1 = null;
		gradebook2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(gradebook1.toString().equals("75.0 64.0 77.0 83.0 83.0 "));
		assertTrue(gradebook2.toString().equals("45.0 93.0 85.0 72.0 89.0 "));
		
		assertEquals(5, gradebook1.getScoreSize());
		assertEquals(5, gradebook2.getScoreSize());
	}

	@Test
	void testSum() {
		assertEquals(382, gradebook1.sum());
		assertEquals(384, gradebook2.sum());
	}

	@Test
	void testMinimum() {
		assertEquals(64, gradebook1.minimum());
		assertEquals(45, gradebook2.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals(318, gradebook1.finalScore());
		assertEquals(339, gradebook2.finalScore());
	}
}
