package IntroToJUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTest {
	Calculator c = new Calculator();
	
	@Test
	public void testAdd() {
		assertTrue(c.add(1, 1) == 2);
	}
	@Test
	public void testSub() {
		assertTrue(c.sub(1, 1) == 0);
	}
	@Test
	public void testMult() {
		assertTrue(c.mult(2, 2) == 4);
	}
	@Test
	public void testDiv() {
		assertTrue(c.div(2, 2) == 1);
	}
	@Test
	public void testMod() {
		assertTrue(c.mod(2, 2) == 0);
	}

}
