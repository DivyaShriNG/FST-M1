package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> myList = new ArrayList<>();
        myList.add("Jyoti");
        myList.add("Girish");
        myList.add("Pankaj");
        myList.add("Laxmi");
        myList.add("Abhiram");
        
        System.out.println("All elements in ArrayList: ");
        for (String values: myList) {
			System.out.println(values);
		}
        
        System.out.println("3rd element in ArrayList: "+myList.get(2));
        System.out.println("Is lists contain 'Jyoti' : "+myList.contains("Jyoti"));
        System.out.println("Size of the ArrayList : "+myList.size());
        System.out.println("Removing 'Laxmi' from the ArrayList : "+ myList.remove("Laxmi"));
        System.out.println("New size of the ArrayList : "+myList.size());
        
	}

}
