package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Map<Integer, String> colours= new HashMap<>();
        
        colours.put(1,"Red");
        colours.put(2,"Yellow");
        colours.put(3,"Pink");
        colours.put(4,"Green");
        colours.put(5,"Blue");
        
        System.out.println("Original HashMap : "+colours);
        
        System.out.println("Removing " +colours.remove(4)+ " colour from HashMap");
        
        if(colours.containsValue("Green")) {
        	System.out.println("Green colour is present in the HashMap ");
        }else {
			System.out.println("Green colour is not present in the HashMap ");
		}
        
        System.out.println("Size of the HashMap : "+colours.size());
        
        System.out.println("Updated HashMap : "+colours);
        
	}

}
