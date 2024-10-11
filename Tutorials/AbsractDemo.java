package Tutorial9;
import java.util.Scanner;
abstract class Employee{
	String name,type;
	Employee(String name,String type){
		this.name=name;
		this.type=type;
	}
	abstract void calcSal();
	void printname(){
		System.out.println("Name:"+name);
	}
}
class FulltymEmployee extends Employee{
	int salary;
	int HRA=1000;
	FulltymEmployee(String name,int salary){
		super(name,"Full Time");
		this.salary=salary;
	}
	void calcSal(){
		System.out.println(name+"'s salary:"+(salary+HRA));
	}
}
class ParttymEmployee extends Employee{
	int hourlyWage;
	int noofHours;
	int workingDays=25;
	ParttymEmployee(String name,int hourlyWage,int noofHours)
{
		super(name,"Part Time");
		this.noofHours=noofHours;
		this.hourlyWage=hourlyWage;
	}
	void calcSal(){
		System.out.println(name+"'s salary:"+(hourlyWage*noofHours*workingDays));
	}
}
class Intern extends Employee{
	int stipend;
	Intern(String name,int stipend){
		super(name,"Intern");
		this.stipend=stipend;
	}
	void calcSal(){
		System.out.println(name+"'s Stipend:"+stipend);
	}
}
public class AbsractDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String choice="yes";
		do{
			System.out.print("Enter employee's name:");
			String name=sc.nextLine();
			System.out.print("Enter employee's job type(Full time,Part Time,Intern):");
			String type=sc.nextLine();
			if(type.equalsIgnoreCase("full time")) {
						System.out.print("Enter the monthly salary:");
						int salary=sc.nextInt();
						sc.nextLine();
						FulltymEmployee f=new FulltymEmployee(name,salary);
						f.calcSal();
			}else if(type.equalsIgnoreCase("part time")){
				System.out.print("Enter hourly wage:");
				int hourlyWage=sc.nextInt();
				System.out.print("Enter number of hours worked/day:");
				int noofHours=sc.nextInt();
				sc.nextLine();
				ParttymEmployee p=new ParttymEmployee(name,hourlyWage,noofHours);
				p.calcSal();
			}else if(type.equalsIgnoreCase("intern")){
				System.out.print("Enter the stipend amount:");
				int stipend=sc.nextInt();
				sc.nextLine();
				Intern i=new Intern(name,stipend);
				i.calcSal();
			}else{
				System.out.println("Invalid type!");
			}
			System.out.println("Do you want to continue(yes/no):");
			choice=sc.nextLine();
		}
		while(choice.equalsIgnoreCase("yes"));
	}
} 