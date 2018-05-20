package main.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.java.MonsoonUmbrellla;

public class MonsoonUmbrellaTest {

	@Test
	public void verifyArgumentsMismatch() {
		MonsoonUmbrellla mu = new MonsoonUmbrellla();
		int[] p = { 4, 4, 3 };
		assertEquals(-1, mu.getUmbrellas(3, p));
	}

	@Test
	public void testPositiveCase1() {
		MonsoonUmbrellla mu = new MonsoonUmbrellla();
		int[] p = { 2, 2, 4 };
		assertEquals(1, mu.getUmbrellas(4, p));
	}

	@Test
	public void testNegativeCase1() {
		MonsoonUmbrellla mu = new MonsoonUmbrellla();
		int[] p = { 1, 2 };
		assertEquals(-1, mu.getUmbrellas(1, p));
	}

	@Test
	public void testPositiveCase2() {
		MonsoonUmbrellla mu = new MonsoonUmbrellla();
		int[] p = { 3, 4, 3, 2 };
		assertEquals(3, mu.getUmbrellas(10, p));
	}

	@Test
	public void testPositiveCase3() {
		MonsoonUmbrellla mu = new MonsoonUmbrellla();
		int[] p = { 3, 4, 3, 2 };
		assertEquals(-1, mu.getUmbrellas(25, p));
	}

	@Test
	public void testPositiveCase4() {
		MonsoonUmbrellla mu = new MonsoonUmbrellla();
		int[] p = { 4, 5, 7, 3,1 };
		assertEquals(2, mu.getUmbrellas(12, p));
	}
	
	@Test
	public void testPositiveCase5() {
		MonsoonUmbrellla mu = new MonsoonUmbrellla();
		int[] p = { 5, 15, 21, 22, 27, 33 };
		assertEquals(2, mu.getUmbrellas(48, p));
	}

}
