package Tutorial9;
import java.util.Scanner;
class Student {
    String name;
    int rollNum;
    int age;
    Student(String name, int rollNum, int age) {
        this.name = name;
        this.rollNum = rollNum;
        this.age = age;
    }
    void printInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNum);
        System.out.println("Age: " + age);
    }
}
class Hostler extends Student {
    String hostelName;
    int roomNum;
    Hostler(String name, int rollNum, int age, String hostelName, int roomNum) {
        super(name, rollNum, age);
        this.hostelName = hostelName;
        this.roomNum=roomNum;
    }
    void printInfo() {
        super.printInfo();
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Room No: "+roomNum);
    }
}
class Dayscholar extends Student {
    String busRoute;
    int busFair;
    Dayscholar(String name, int rollNum, int age, String busRoute, int busFair) {
        super(name, rollNum, age);
        this.busRoute = busRoute;
        this.busFair=busFair;
    }
    void printInfo() {
        super.printInfo();
        System.out.println("Bus Route: " + busRoute);
        System.out.println("Bus fair: "+busFair);
    }
}
public class InheritanceDemoStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        int rollNum = sc.nextInt();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter student type (Hostler/Dayscholar): ");
        String studentType = sc.nextLine();
        if (studentType.equalsIgnoreCase("Hostler")) {
            System.out.print("Enter hostel name: ");
            String hostelName = sc.nextLine();
            System.out.print("Enter room no: ");
            int roomNum=sc.nextInt();
            Hostler hos = new Hostler(name, rollNum, age, hostelName,roomNum);
            hos.printInfo();
        } else if (studentType.equalsIgnoreCase("Dayscholar")) {
            System.out.print("Enter bus route: ");
            String busRoute = sc.nextLine();
            System.out.print("Enter bus fair: ");
            int busFair=sc.nextInt();
            Dayscholar dsch = new Dayscholar(name, rollNum, age, busRoute,busFair);
            dsch.printInfo();
        } else {
            System.out.println("Invalid student type.");
        }
    }
}