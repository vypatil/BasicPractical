package com.demo.forloop;

public class PrintSquarePattern {
	
	public static void main(String[] args) {
		
		
		int size = 10;
		
		for(int i=1 ; i<=size ; i++) {
			
			for(int j =1 ; j<=size ; j++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// print triangle pattern
		
		int num = 5;
		
		for(int i=1 ; i<=num ; i++) {
			
			for(int j=1 ; j<=i ; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
