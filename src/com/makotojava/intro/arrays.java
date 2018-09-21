package com.makotojava.intro;
import java.util.Arrays;
public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		String manny;
//		manny = "Seen";
//		
//	System.out.print(manny);
		
	
		//the above s assgnng value to the nteger... ths can be done usng the code below
		
		int[] aryNums = {10, 14, 36, 27, 43, 18};
		
		Arrays.sort(aryNums);
		
	int i;
		
		for (i=0;i < aryNums.length;i++) {
			System.out.println("Nums: " + aryNums[i]);
		}

	}

}
