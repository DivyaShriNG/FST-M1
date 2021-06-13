package activities;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initializing array m printing it
		int [] numArray= {10, 77,10,54,-11,10};
		System.out.println("Original Array: "+Arrays.toString(numArray));
		
		int searchNum= 10;
		int fixedSum =30;
		
		System.out.println("Result: " +result(numArray, searchNum, fixedSum));

	}
	
	public static boolean result(int[] numbers, int searchNum, int fixedSum) {
		
		int tempSum=0;
		
		//forEach loop
		for (int i : numbers) {
			
			//if number in array exactly equal to 10 then add in tempSum
			if(i==searchNum)
				tempSum += searchNum;
			
			
			//if tempSum becomes greater than 30 then stop loop
			if(tempSum>fixedSum)
				break;
		
		}
		
		// returning boolean result if conditions fulfilled
		return tempSum==fixedSum;
		
	}

}
