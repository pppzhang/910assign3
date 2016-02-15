package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator cal = new Calculator();
		assertNotNull(cal);
	}

	@Test
	public void testGetTotal() {
		Calculator cal =  new Calculator();
		assertEquals(0, cal.getTotal());		
	}

	@Test
	public void testAdd() {
		Calculator cal = new Calculator();
		cal.add(5);
		assertEquals(5, cal.getTotal());
	}

	@Test
	public void testSubtract() {
		Calculator cal = new Calculator();
		cal.add(10);
		cal.subtract(2);
		assertEquals(8, cal.getTotal());
	}

	@Test
	public void testMultiply() {
		Calculator cal = new Calculator();
		cal.add(10);
		cal.multiply(3);
		assertEquals(30, cal.getTotal());
	}

	@Test
	public void testDivide() {
		Calculator cal = new Calculator();
		cal.add(10);
		cal.divide(5);
		assertEquals(2, cal.getTotal());
		cal.divide(0);
		assertEquals(0, cal.getTotal());
	}

	@Test
	public void testGetHistory() {
		Calculator cal = new Calculator();
		cal.add(10);
		cal.divide(5);
		cal.multiply(3);
		cal.subtract(4);
		assertEquals("0 + 10 / 5 x 3 - 4", cal.getHistory());
	}

}
