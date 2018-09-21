package com.makotojava.intro;

import java.util.Scanner; //the library imported as a class
public class SaneClouxz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this programme is for converting degree celsius to degree kelvin
		//the scanner library is used for collecting user data but not in form of a dialogue box, compare to the JOptionPane library
		
		Scanner user_input = new Scanner (System.in); //library being converted to an object before use
		//system.in command tells java to collect the data as input
		
		int tempCelsius;
		System.out.print("Enter Temperature in Celsius: "); //this is like some kind of instruction for the data required for the space
		tempCelsius = user_input.nextInt();
		
		String username;
		System.out.print("Enter your Username: ");
		username = user_input.next();
		
		int constant; 
		constant = 273;
		
		int tempKelvin;
		tempKelvin = (tempCelsius + constant);
		
		System.out.println("Dear " + username + ", temperature in kelvin is " + tempKelvin + " degrees");
		
		}

}
