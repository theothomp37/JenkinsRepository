package com.revature;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestClassTester {
	
	@Test
	public void test() {
		assertEquals("Should return true", true, new TestClass().test());
	}

}
