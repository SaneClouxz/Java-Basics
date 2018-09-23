package com.makotojava.intro;

public class Error_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//trying error catch in java class... here im trying to catch a divide by zero exception 
		try {
			int a = 10;
			int b = 0;
			int c = a/b;
			
			System.out.println(c);
					
		}
		catch(Exception error) {
			System.out.println(error.getMessage());
		}

	}

}
