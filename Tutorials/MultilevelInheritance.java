/*Write a Java program to implement Multilevel Inheritance.
 * Implement a class hierarchy for different types of vehicles.
 *  Written By:TONY ANTONY*/
package Tutorial7;
import java.util.*;

class Vehicle{
	String model;
	int year;
	void printvehicle() {
		System.out.println("Mode: "+model);
		System.out.println("Year: "+year);
	}
}

class Car extends Vehicle{
	String color, terrain,type;
	void printcar() {
		System.out.println("Color: "+color);
		System.out.println("Type: "+type);
		System.out.println("Terrain:: "+terrain);
	}
}

class ElectricCar extends Car{
	int battery,range,chargingtime;
	void printev() {
		System.out.println("Battery Capacity: "+battery+" kWh");
		System.out.println("Maximum range: "+range+" km");
		System.out.println("Charging time: "+chargingtime+" Hrs");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ElectricCar ob3=new ElectricCar();
		System.out.println("ENTER VEHICLE DETILS;");
		System.out.println("Enter the model of vehicle:");
		ob3.model=sc.nextLine();
		System.out.println("Enter the year:");
		ob3.year=sc.nextInt();
		System.out.println("ENTER CAR DETAILS;");
		sc.nextLine();
		System.out.println("Enter the color:");
		ob3.color=sc.nextLine();
		System.out.println("Enter the type:");
		ob3.type=sc.nextLine();
		System.out.println("Enter the terrain:");
		ob3.terrain=sc.nextLine();
		System.out.println("ENTER EV DETAILS;");
		System.out.println("Enter the battery capacity:");
		ob3.battery=sc.nextInt();
		System.out.println("Enter the maximum range on  single charge:");
		ob3.range=sc.nextInt();
		System.out.println("Enter the charging time:");
		ob3.chargingtime=sc.nextInt();

		System.out.println("VEHICLE DETILS");
		ob3.printvehicle();
		System.out.println("CAR DETAILS");
		ob3.printvehicle();
		ob3.printcar();
		System.out.println("EV DETAILS");
		ob3.printvehicle();
		ob3.printcar();
		ob3.printev();
	}
}
