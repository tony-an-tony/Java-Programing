package oopj24lab71;
import java.util.*;
class Employee1{
	float salary;
	int da,hra;
	Employee1(float salary,int da,int hra){
		this.salary=salary;
		this.da=da;
		this.hra=hra;
	}
	void printemp() {
		System.out.println(".....EMPLOYEE.....");
	}
	float sal;
	void calcsal() {
		this.sal=(salary+(salary*da/100)+(salary*hra/100));
		System.out.println("The Gross Salary of The Employee is:"+sal);
	}
}
class Engineer1 extends Employee1
{
	Engineer1(float salary,int da,int hra)
	{
		super(salary,da,hra);
	}
	void printemp() {
		super.printemp();
		super.calcsal();
		System.out.println(".....ENGIINEER.....");
	}
	void calcsal() 
	{
		float sal2=2*sal;
		System.out.println("The Gross Salary of The Engneer is:"+sal2);
	}
}
public class SuperDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the basic salary of the Employee:");
		float bsal=sc.nextFloat();
		System.out.println("Enter the DA% of the Employee:");
		int da=sc.nextInt();
		System.out.println("Enter the HRA% of the Employee:");
		int hra =sc.nextInt();
		Engineer1 obj = new Engineer1(bsal,da,hra);
		obj.printemp();
		obj.calcsal();
	}
}
