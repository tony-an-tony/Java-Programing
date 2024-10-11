/*program to check if a given year is a leap year or not using if-else statements.
written by:Tony Antony.*/
package Tutorial3;
import java.util.*;
public class CheckLeapYr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year :");
		int x=sc.nextInt();
		if((x%4 == 0 && x%100 !=0) || (x%400 ==0)) {
			System.out.print(x+" is a Leap Year.");
		}else {
			System.out.print(x+" is not a Leap Year.");
		}
	}

}
