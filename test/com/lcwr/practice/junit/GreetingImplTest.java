package com.lcwr.practice.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingImplTest {
	
	@Test
	public void greetShouldReturnAValidOutput() {
		System.out.println("greetShouldReturnAValidOutput");
		 Greeting greeting = new GreetingImpl();
		String result = greeting.greet("Junit");
		assertNotNull(result);
		assertEquals("Hello Junit", result);
	}
}
