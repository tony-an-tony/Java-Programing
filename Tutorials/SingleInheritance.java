/*Write a Java program to implement Single Inheritance.
 * Create a simple application to manage employees and managers.
 * Written By:TONY ANTONY*/
package Tutorial7;
import java.util.*;
class Employee{
	String name;
	int id;
	int printemployee() {
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		return 0;
	}
}
class Manager extends Employee{
	String department;
	int printdep() {
		System.out.println("Department: "+department);
		return 0;
	}
}
public class SingleInheritance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   Employee obj1=new Employee();
		   Manager obj2=new Manager();
		   
		   System.out.print("Enter the employee name:");
		   obj1.name=sc.nextLine();
		   System.out.print("enter ID:");
		   obj1.id=sc.nextInt();
		   sc.nextLine();
		   
		   System.out.print("Enter the manager name:");
		   obj2.name=sc.nextLine();
		   System.out.print("enter ID:");
		   obj2.id=sc.nextInt();
		   sc.nextLine();
		   System.out.print("enter department");
		   obj2.department=sc.nextLine();
		   
		   System.out.println("\nEMPLOYEE DETAILS");
		   obj1.printemployee();
		   System.out.println("\nMANAGER DETAILS DETAILS");
		   obj2.printemployee();
		   obj2.printdep();
	}
}
