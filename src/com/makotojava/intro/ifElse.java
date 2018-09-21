package com.makotojava.intro;
import javax.swing.JOptionPane;
public class ifElse {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String User = JOptionPane.showInputDialog("Enter your Age", "Age"); //USed the JOption library to collect user age
	//the user is a string, but my operators are number related, since im using a JOptonPame command which requires a string method 
	
	if (Integer.parseInt(User) <= 18) {
		System.out.print("User is 18 or younger, Oops! NO BEEEEERRRRR!!!");
		
		//the Integer.parsenInt is used for converting string to integer
		}
	else if(Integer.parseInt(User) > 18 && Integer.parseInt(User) < 30 ) { //another way is saying user is User >= 29 
		System.out.print("User is older than 18 but less than 30 years of age.. 12 bottles of beer allowed");
	}
	
	else if (Integer.parseInt(User) > 30 && Integer.parseInt(User) < 70){
		System.out.print("User is 30 years of age or older! Drink till you knock out..");
	}
	else if (Integer.parseInt(User) == 70 || Integer.parseInt(User) == 75) {
		System.out.print("User is exactly 70 or 75 years old! Drinks on the house for today");
	}
	else if(Integer.parseInt(User) > 69 && Integer.parseInt(User) < 99){
		System.out.print("User is 70 years of age or older! Drink responsibly grandy..");
	}
	else {
		System.out.print("User is too old! you need no drink to die");
	}
	}
	
}
