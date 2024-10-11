package oopj24lab71;
import java.util.*;
public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ch="y";
		do {
		System.out.println("..........MENU..........");
		System.out.println("1.ArithmeticException\n2.ArrayIndexOutOfBoundsException");
		System.out.print("Enter option");
		int op=sc.nextInt();
		switch (op) {
		case 1:
		System.out.println("Program to perform division");
		System.out.print("Enter No.1:");
		int a=sc.nextInt();
		System.out.print("Enter No.2:");
		int b=sc.nextInt();
		try {
			int rslt=a/b;
			System.out.println("Result="+rslt);
			System.out.println("End of try block");
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block content");
			System.out.println("My code is safe from exception");
		}
		break;
		case 2:
		System.out.print("Enter the no of elements do you want to store");
		int x=sc.nextInt();
		System.out.println("Enter the elements of the array ");
		int[] arr=new int[x];
		for(int i=0;i<x;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array length:"+x);
		System.out.print("Array elements are\n");
		for(int i=0;i<x;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println("\nEnter the position of element to be accessed ");
		int n=sc.nextInt();
		try {
			System.out.println(arr[n]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		break;
		}
		System.out.println("Do you want to continue?(y/n)");
		ch=sc.next();
		}while(ch.equalsIgnoreCase("y"));
	}

}
