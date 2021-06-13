package activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> hs= new HashSet<>();
		
		hs.add("J");
		hs.add("Y");
		hs.add("O");
		hs.add("T");
		hs.add("I");
		hs.add("C");
		
		System.out.println("Original Hashset : "+hs);
		
		System.out.println("Size of the HashSet : "+hs.size());
		System.out.println("Removing 'C' from the HashSet : "+hs.remove("C"));
		
		 if(hs.remove("Z")) {
	        	System.out.println("Z removed from the Set");
	        } else {
	        	System.out.println("Z is not present in the Set");
	        }
		
		System.out.println("Is 'Y' present in the HashSet : "+hs.contains("Y"));
		
		System.out.println("Updated values in HashSet : "+hs);
				
		
	}

}
