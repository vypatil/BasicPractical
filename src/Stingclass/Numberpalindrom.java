package Stingclass;

import java.util.Scanner;

public class Numberpalindrom {

	public static void main(String[] args) {
		
		 int id =121;							//#1
		 System.out.println(ispalindrom(id));
		 
		 
		 Scanner sc = new Scanner(System.in);	//#2
		 System.out.println("enter the number");
		 int number = sc.nextInt();
		 System.out.println(ispalindrom2(number));
		 
	}
	
	public static boolean ispalindrom (int id) {
		
		String s = String.valueOf(id);
		
		StringBuffer value = new StringBuffer(s);
		value.reverse();
		
		String obj = new String(value);
		
		if(s.equals(obj)) {
			return true;
			
		}
		else return false;
		
	}
	
	public static boolean ispalindrom2 (int number) {
		
		String s = String.valueOf(number);
		
		StringBuilder value = new StringBuilder(s);
		value.reverse();
		
		String reverse = new String(value);
		
		if(s.equals(reverse)) {
			
			return true;
			
		}else return false;
		
	}
}
