package activities;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] numArray= {9,12,6,14,10,4,8,3,20,1};
       System.out.println("Original numbers: "+Arrays.toString(numArray));
       
       insertionSort(numArray);
       
       System.out.println("Sorted array in ascending order: "+Arrays.toString(numArray));
	}

	public static void insertionSort(int [] numInput) {
		int size= numInput.length, i;
		
		for (i = 1; i < size; i++) {
			
			int key= numInput[i];
			int j=i-1;
			
			while(j>=0 && key<numInput[j]) {
				
				numInput[j+1]= numInput[j];
				--j;
				}
			numInput[j+1]=key;
			
		}
	}
}
