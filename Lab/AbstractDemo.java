package oopj24lab71;
import java.util.*;
abstract class shape{
	abstract void sides(int n);
}
class Triangle extends shape{
	void sides(int n) {
		System.out.print("I am Triangle.I have 3 sides");
		int angle=(n-2)*180;
		System.out.print("\nSum of angles: "+angle);
	}
}
class Rectangle extends shape{
	void sides(int n) { 
		System.out.print("I am Rectangle.I have 4 sides. ");
		int angle=(n-2)*180;
		System.out.print("\nSum of angles: "+angle);
	}
}
class Hexagon extends shape{
	void sides(int n) {
		System.out.print("I am Hexagon.I have 6 sides. ");
		int angle=(n-2)*180;
		System.out.print("\nSum of angles: "+angle);
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Triangle t= new Triangle();
		Rectangle r=new Rectangle();
		Hexagon h=new Hexagon();
		
		String choice;
		do {
			System.out.print("Enter no of sides:");
			int n=sc.nextInt();
			switch(n) {
			case 3:
				System.out.println("Shape with "+n+" sides");
				t.sides(n);
				break;
			case 4:
				System.out.println("Shape with "+n+" sides");
				r.sides(n);
				break;
			case 6:
				System.out.println("Shape with "+n+" sides");
				h.sides(n);
				break;
				default:
					System.out.println("Shape with "+n+" sides not supported");
			}
					System.out.println("\nDo you want to continue(yes/no)");
					choice=sc.next();
		}
		while (choice.equalsIgnoreCase("yes"));
	
	}
}