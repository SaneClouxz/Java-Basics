package com.makotojava.intro;
import java.util.Scanner;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner user_input = new Scanner(System.in);
		
		
		int start;
		start = 0;
		int end = 13;
		
		int addition;
		addition = 10;
		
		
		
		int compute;
		System.out.println("Enter value to compute: ");
		compute = user_input.nextInt();
			
			
		for (start = 0; start < end; start++) {
		
		int value;
		value = 10 * start;
			//the for loop follow the order of having two sets.. i.e the start and end, start from 0 till all values of start less than end by adding 1 each time
			System.out.println(start + " times " + addition + " = " + value);
			
			//note the System.out.prntln command print the next command on another line while the .print print everything on a line
			
		}
		
	
	}

}
