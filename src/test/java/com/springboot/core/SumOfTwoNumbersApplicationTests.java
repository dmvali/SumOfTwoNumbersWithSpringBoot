package com.springboot.core;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.core.beans.SumExample;


@SpringBootTest
class SumOfTwoNumbersApplicationTests {
	@Autowired
	private SumExample sumExample;
	
	@Test
	void testSumOfTwoNumbers() {
		assertEquals(10, sumExample.add(5, 5));
	}

}
