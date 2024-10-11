/*program to print the Fibonacci series up to a given number using a while loop.
written bu:Tony Antony.*/
package Tutorial3;
import java.util.*;
public class FibonacciUsingWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int n = sc.nextInt();
		int f = 0,s = 1,next;
		int count=2;
		System.out.print("Fibonacci series uoto "+n+" is :"+f+" "+s);
		while(count<n) {
			next=f+s;
			System.out.print(" "+next);
			f=s;
			s=next;
			count++;
		}
	}
}
