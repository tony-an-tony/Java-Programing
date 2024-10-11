package oopj24lab71;
import java.util.*;
class Employee {
	int age;
	long salary,ph_no;
	String name,address;
	void printslary() {
		System.out.print("\nSalary:"+salary);
	}
	void print_employee() {
		System.out.print("Name: "+name);
		System.out.print("\nAge: "+age);
		System.out.print("\nAddress: "+address);
		System.out.print("\nPhone Number: "+ph_no);
	}
}
class Officer extends Employee{
	String spec;
	void printspecialization() {
		System.out.print("\nSpecialization:"+spec);
	}
}class Manager extends Employee{
	String department;
	void printdept() {
		System.out.print("\nDepartment: "+department);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Officer ob1 = new Officer();
		System.out.print("Enter the officer's name: ");
		ob1.name=sc.nextLine();
		System.out.print("Enter Address: ");
		ob1.address=sc.nextLine();
		System.out.print("Enter Specialization: ");
		ob1.spec=sc.nextLine();
		System.out.print("Enter Age: ");
		ob1.age=sc.nextInt();
		System.out.print("Enter Phone Number: ");
		ob1.ph_no=sc.nextLong();
		System.out.print("Enter Salary: ");
		ob1.salary=sc.nextLong();

		Manager ob2 = new Manager();
		sc.nextLine();
		System.out.print("Enter the manager's name: ");
		ob2.name=sc.nextLine();
		System.out.print("Enter Address: ");
		ob2.address=sc.nextLine();
		System.out.print("Enter Department: ");
		ob2.department=sc.nextLine();
		System.out.print("Enter Age: ");
		ob2.age=sc.nextInt();
		System.out.print("Enter Phone Number: ");
		ob2.ph_no=sc.nextLong();
		System.out.print("Enter Salary: ");
		ob2.salary=sc.nextLong();
		
		System.out.print("\nOFFICER DETAILLS:\n");
		ob1.print_employee();
		ob1.printslary();
		ob1.printspecialization();
		
		System.out.print("\n\nMANAGER DETAILLS:\n");
		ob2.print_employee();
		ob2.printslary();
		ob2.printdept();
	}
}
