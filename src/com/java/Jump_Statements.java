package com.java;

public class Jump_Statements {

	public static void main(String[] args) {
		int i =1, limit=100;
		
		for(;i<=limit;i=i+1) {
			
			if(i==50) {
				//break;
				continue;
				
			}System.out.println(i);
		}
		System.out.println("Outside of the for block");

	}

}
