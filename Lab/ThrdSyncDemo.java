package oopj24lab71;
import java.util.*;
class mytable extends Thread{
	int num;
	mytable(int num){
		this.num=num;
	}
	public void run() {
		synchronized(mytable.class) {
			try {
				for(int i=1;i<=5;i++) {
					System.out.println(num+"+"+i+"="+(num+i));
					sleep(1000);
				}
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
public class ThrdSyncDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter 1st number whose addition table is needed");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd number whose addition table is needed");
		int num2=sc.nextInt();
		System.out.println("Enter 3rd number whose addition table is needed");
		int num3=sc.nextInt();
		mytable t1=new mytable(num1);
		mytable t2=new mytable(num2);
		mytable t3=new mytable(num3);
		t1.start();
		t2.start();
		t3.start();
	}
}
