package com.epam.Hometask8;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class RemoveAtest {
	RemoveAj removeAj;
	@Before
	public void setUp() {
		removeAj = new RemoveAj();
	}

	@Test
	public void testAll() {
		assertEquals("BAA", removeAj.removeA("AABAA"));
		
	}
	@Test
	public void testFirst() {
		assertEquals("BCD", removeAj.removeA("ABCD"));
	}
	@Test
	public void testFirstTwo() {
		assertEquals("CD", removeAj.removeA("AACD"));
	}
	@Test
	public void testSecond() {
		assertEquals("BCD", removeAj.removeA("BACD"));
	}
	@Test
	public void testLast() {
		assertEquals("BBAA", removeAj.removeA("BBAA"));
	}
	@Test
	public void testString() {
		assertEquals("BBAABHAA", removeAj.removeA("AABBAABHAA"));
	}

	

}
