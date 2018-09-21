package com.makotojava.intro;
import java.util.Scanner;
public class switchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		int user;
		System.out.print("Enter age here: ");
		user = userInput.nextInt();
		
		switch (user) {
		case 18:
			System.out.println("You're 18 years old");
			break;
		case 19:
			System.out.println("You're definnitely 19 years old");
			break;
		case 20:
			System.out.println("C'mon you're 20");
			break;
		default:
			System.out.println("You're neither 18 nor 19, nor 20");
		}

	}

}
