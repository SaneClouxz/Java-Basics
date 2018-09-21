package com.makotojava.intro;

public class javaFormattedStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String heading1 = "Exam Name";
		String heading2 = "Exam Grade";
		String divider = "-----------------------------------------------";
		
		String name1 = "JAVA";	String grade1 = "A";
		String name2 = "PHP";	String grade2 = "B";
		String name3 = "VB NET"; String grade3 = "A";
		
		System.out.println("");
		System.out.printf("%-15s %15s %n", heading1, heading2);
		System.out.println(divider);
		
		System.out.printf("%-15s %15s %n", name1, grade1);
		System.out.printf("%-15s %15s %n", name2, grade2);
		System.out.printf("%-15s %15s %n", name3, grade3);
		
		System.out.println(divider);
		System.out.println("");
		
		
//		System.out.printf("%-15s %15s %n", heading1,heading2);
		//the s character indicates string formatting d for int formatting
		//%-15s tells a left justified column, %15s means justified to the right and %n indicates a new line 
		//after the characters above the variable to be formatted are entered
		//if .value is added for the d formatting it tell roundng off the the value entered
		
		
		
		

	}

}
