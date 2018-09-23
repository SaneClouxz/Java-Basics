package com.makotojava.intro;

public class methodCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyMethods test1 = new MyMethods();
		
		int aVal = test1.total();
		//created a new object called test1 from the method created.. next I create a new object called aVal to call the method total.
		
		System.out.println("Method Result= " + aVal);
		
		test1.print_text();
		
		int aVal2 = test1.total(30);
		
		System.out.println("aVal2 = " + aVal2);
		
		test1.printText("Goodluck", 567);

	}

}
