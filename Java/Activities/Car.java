package activities;

public class Car {
 
	public String color, transmission;
	public int make, tyres, doors;
	
	//constructor to initialize values
	public Car() {
		tyres=4;
		doors=4;
	}
	
	public void displayCharacterstics() {
		System.out.println("Color of the Car : "+color);
		System.out.println("Transmission of the Car: "+transmission);
		System.out.println("Make of the Car : "+make);
		System.out.println("Number of tyres of the Car : "+tyres);
		System.out.println("Number of doors of the Car: "+doors);	
	}
	
	public void accelarate() {
		System.out.println("Car is moving forward");
	}
	
	public void brake() {
		System.out.println("Car has stopped");
	}
}
