package com.save;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class test_calculation {
	
	Calculation calcObj = new Calculation ();
	
	@Test
	public void test_sum () {
		assertEquals(4,calcObj.sum(2, 2));
	}
}
