package com.springboot.core.beans;

import org.springframework.stereotype.Component;

@Component
public class SumExample {
	
	public int add(int firstNum,int secondNum) {
		
		return firstNum + secondNum;
	}
}
