package com.java;

import java.util.Arrays;

public class VariableDeclaration {

	public static void main(String[] args) {
		
		
		int otp=83838555,orderId;
		long phone=937373737L;
		orderId=827;
		byte value1=78;
		short value2=89;
		
		char symbol='8';
		
		boolean status=true;
		
		
		float amount=560.78F;
		double interestAmount=8976.67D;
		
		
		int scores[]=new int[10]; //10 indicates number of elements
		int scores1[]= {11,22,33,44,55,66,77,88};
		
		float amounts[]=new float[5];
		float amounts1[]= {12.5f,78.5f,8.5f,9.6f};
		
		char vowels[]= {'a','e','i','o','u'};
		
		System.out.println(orderId);
        
        
        System.out.println(symbol);
        System.out.println(amount);
        System.out.println(interestAmount);
        System.out.println(Arrays.toString(scores1));
	}

}
