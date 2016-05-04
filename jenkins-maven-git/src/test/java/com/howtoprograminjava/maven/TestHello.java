package com.howtoprograminjava.maven;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestHello {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertTrue("Hello World !".equals(Hello.getMessage()));
	}

}
