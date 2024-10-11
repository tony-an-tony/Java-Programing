package oopj24lab71;
import java.util.*;
public class MethodOverloading {
	void area (float base,float height) {
		double a=(0.5*base*height);
		System.out.print("\nArea of triangle with base: "+base+" and height: "+height+" is "+a+"\n");
	}
	void area (int width,int length) {
		long a=width*length;
		System.out.print("\nArea of rectangle with width: "+width+" and height: "+length+" is "+a+"\n");
	}
	void area (float radius) {
		double a=(3.14*radius*radius);
		System.out.print("\nArea of circle with radius: "+radius+" is "+a+"\n");
	}
	public static void main(String[] args) {
		MethodOverloading object = new MethodOverloading();
		Scanner sc= new Scanner(System.in);
		float base,height,radius;
		int length,width;
		System.out.print("Enter the base of the triangle :");
		base=sc.nextFloat();
		System.out.print("\nEnter the height of the triangle :");
		height=sc.nextFloat();
		System.out.print("\nEnter the width of the rectangle :");
		width=sc.nextInt();
		System.out.print("\nEnter the height of the rectangle :");
		length=sc.nextInt();
		System.out.print("\nEnter the radius of the circle :");
		radius=sc.nextFloat();
		object.area(base,height);
		object.area(width,length);
		object.area(radius);
		

	}

}