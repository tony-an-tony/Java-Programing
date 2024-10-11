package Tutorial11;
import java.util.*;
import Tutorial11.sub.Woman;
public class Man {
    private String name;
    private int age;
    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayMe() {
        System.out.println("Man's Name: " + name + ", Age: " + age);
    }
    public class Main {
        public static void main(String[] args) {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter man's name and age;");
        	String mname=sc.next();
        	int mage=sc.nextInt();
        	System.out.println("Enter woman's name and age;");
        	String wname=sc.next();
        	int wage=sc.nextInt();
            Man m = new Man("Smith", 40);
            Woman w = new Woman("Jane", 35);
            m.displayMe();
            w.displayMe();
        }
    }
}