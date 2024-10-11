
/*program to print the factorial of a given number using a while loop.
written by:Tony Antony.*/
package Tutorial3;
import java.util.*;
public class FactorialUSingWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int n = sc.nextInt();
		long fact=1L;
		int i=0;
		while(i<n){
			fact=fact*(n-i);
			i++;
		}
		System.out.print("Fatorial of " + n + " is " + fact);
		
	}

}
