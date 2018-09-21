package com.makotojava.intro;
import javax.swing.JOptionPane;

public class optionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//the library imported is used for collecting user information in form of a prompting dialogue box
		//this class is maybe already an object and ready for use

		String first_name;
		first_name = JOptionPane.showInputDialog("First Name", "Enter your first Name");
		
		String family_name;
		family_name = JOptionPane.showInputDialog("Family Name", "Enter your family name");
		
		String gender;
		gender = JOptionPane.showInputDialog("Gender", "Enter your gender");
		
		String full_name = "Welcome, " + first_name + " " + family_name + " (" + gender + ")";
		
		JOptionPane.showMessageDialog(null, full_name, "name", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
		
		
	}

}
