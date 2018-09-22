package com.makotojava.intro;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class areaVolumes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//the aim of this programme is to calculate the area and volume of given shapes {circle, sphere, square, cylinder and cone}

		
		Scanner user_input = new Scanner (System.in);
		
		
		double pi;
		pi = 3.142;
		
//		String length = user_input.next();
//		String height = user_input.next(); 
//	
//		
//		String circle;
//		double area_circle;
//		String radius = user_input.next();
//		area_circle = pi*Integer.parseInt(radius )*Integer.parseInt(radius);		
//		double volume_circle;
//		volume_circle = 2*pi*Integer.parseInt(radius);
//		
//		String sphere;
//		double area_sphere;
//		area_sphere = 4*pi*Integer.parseInt(radius)*Integer.parseInt(radius);
//		double volume_sphere;
//		volume_sphere = (4/3)*pi*Integer.parseInt(radius)*Integer.parseInt(radius)*Integer.parseInt(radius);
//		
//		String square;
//		double area_square;
//		area_square = Integer.parseInt(length)*Integer.parseInt(length);
//		double volume_square;
//		volume_square = Integer.parseInt(length)*Integer.parseInt(length)*Integer.parseInt(length);
//		
//
//		String cylinder;
//		double area_cylinder;
//		area_cylinder = ((2*area_circle*Integer.parseInt(height)) + 2*area_circle);
//		double volume_cylinder;
//		volume_cylinder = area_circle*Integer.parseInt(height);
		
		int shape;
		System.out.print("Enter 1 for circle, 2 for sphere, 3 for square or 4 for cylinder: ");
		shape = user_input.nextInt();
		
		String radius;
		String length;
		String height;
		switch (shape) {
		case 1:
			System.out.print("Enter radius of circle: ");
			radius = user_input.next();
			System.out.println("The area of the circle is " + pi*Integer.parseInt(radius )*Integer.parseInt(radius) + " and the volume is " + 2*pi*Integer.parseInt(radius));	
			break;
		
		
		case 2:
			System.out.print("Enter radius of sphere: ");
			radius = user_input.next();
			System.out.println("The area of the sphere is " + 4*pi*Integer.parseInt(radius)*Integer.parseInt(radius) + " and the volume is " + (4/3)*pi*Integer.parseInt(radius)*Integer.parseInt(radius)*Integer.parseInt(radius));
			break;
			
		case 3:
			System.out.print("Enter length of square: ");
			length = user_input.next();
			System.out.println("The area of the square is " + Integer.parseInt(length)*Integer.parseInt(length) + " and the volume is " + Integer.parseInt(length)*Integer.parseInt(length)*Integer.parseInt(length));
			break;
		
		case 4:
			System.out.print("Enter radius of cylinder: ");
			radius = user_input.next();
			System.out.print("Enter height of cylinder: ");
			height = user_input.next();
			System.out.println("The area of the cylinder is " + 2*pi*Integer.parseInt(radius)*Integer.parseInt(radius)*Integer.parseInt(height) + " and the volume is " + 2*pi*Integer.parseInt(radius)*Integer.parseInt(height));
			break;
			
			default:
				System.out.println("Shape not found");
			
			
		}
	}
}
		
		
		

		
		
		
		
				
		
		
		
		




