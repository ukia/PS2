package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class test_mylnteger {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testisEven() {
		assertTrue(Mylnteger.isEven(2));
		assertFalse(Mylnteger.isEven(3));
		
	}
	public void testisOdd() {
		assertTrue(Mylnteger.isOdd(1));
		assertFalse(Mylnteger.isOdd(4));
		
}
	public void testisPrime() {
		assertTrue(Mylnteger.isPrime(1));
		assertFalse(Mylnteger.isPrime(6));
		
}
}