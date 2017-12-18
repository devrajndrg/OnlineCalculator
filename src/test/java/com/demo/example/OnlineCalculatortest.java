package com.demo.example;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class OnlineCalculatorTest {

	static OnlineCalculator obj;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		obj= new OnlineCalculator();
		
	}

	@Test
	public void testAdd() {
		int result = obj.add(2, 3);
		assertEquals(5,result);
	}

}
