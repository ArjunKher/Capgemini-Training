package com.vunnam.boot.rest;

import org.springframework.stereotype.Service;

@Service
public class AllServices {
	/*
	1. Addition of the 2 numbers
	2. Subtraction of the 2 numbers
	3. Multiplication of 2 numbers
	4. Division of 2 numbers
	5. Finding square root of a number*/
	public long add(long n1,long n2) {
		return n1+n2;
	}
	public long subtract(long n1,long n2) {
		return n1-n2;
	}
	public long multiply(long n1,long n2) {
		return n1*n2;
	}
	public double division(double n1,double n2) {
		if(n2!=0) {
			return n1/n2;
		}
		return 0;
	}
	public double sqrt(double n) {
		return Math.sqrt(n);
	}
	
}
