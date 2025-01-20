package com.demo.forloop;

public class CalculateSum {
	
	public static void main(String[] args) {
		
//		int sum = 0;
//		
//		for(int i =1 ; i<=50 ; i++) {
//			sum = sum+i;
//		}
//		
//		System.out.println("total sum of 1 to 50 numbers = " + sum);
//		
//		
		
		// print alphabets with numbers 
		
		System.out.println("Alphabets");
		for(char ch ='A' ; ch <= 'Z'; ch++) {
			
			int position = ch -'A' + 1;
			System.out.println(ch + " : " + position);
		}
		
		
	}
	
	
	
	

}
