/*Write a Java program to implement Hierarchical Inheritance.
 * Design a hierarchy of employee types within a company.
 * Written By:TONY ANTONY*/
package Tutorial7;
import java.util.*;
class Employeee{
	public String name,eid;
	void printemp() {
		System.out.println("Name: "+name);
		System.out.println("Employee ID: "+eid);
	}
}
class FullTimeEmployee extends Employeee{
	double salary;
	String benefits;
	void printft() {
		System.out.println("Salary: "+salary);
		System.out.println("Available benefits: "+benefits);
	}
}
class PartTimeEmployee extends Employeee{
	int hrsworked;
	float hrlyrate;
	void printpt() {
		System.out.println("Hourly rate: "+hrlyrate);
		System.out.println("Hours Worked: "+hrsworked);
		System.out.println("Total amount earned: "+(hrsworked*hrlyrate));
	}
}
public class HierarchicalInheritance{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PartTimeEmployee A=new PartTimeEmployee();
		FullTimeEmployee B= new FullTimeEmployee();
		System.out.println("ENTER PARTTIME EMPLOYEE DETAILS");
		System.out.print("Enter Name: ");
		A.name=sc.nextLine();
		System.out.print("Enter Employee ID: ");
		A.eid=sc.nextLine();
		System.out.print("Enter Hours worked: ");
		A.hrsworked=sc.nextInt();
		System.out.print("Enter Hourly rate: ");
		A.hrlyrate=sc.nextFloat();
		
		System.out.println("ENTER FULLTIME EMPLOYEE DETAILS");
		sc.nextLine();
		System.out.print("Enter Name: ");
		B.name=sc.nextLine();
		System.out.print("Enter Employee ID: ");
		B.eid=sc.nextLine();
		System.out.print("Enter Salary: ");
		B.salary=sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter Benefits: ");
		B.benefits=sc.nextLine();

		System.out.println("\nPartTime Employee \n-----------------");
		A.printemp();
		A.printpt();
		System.out.println("\nFullTime Employee \n-----------------");
		B.printemp();
		B.printft();
	}

}
