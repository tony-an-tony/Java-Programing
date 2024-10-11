/*program to print the reverse of a given number using a for loop.
written by:Tony Antony.*/
package Tutorial3;
import java.util.*;
public class ReverseUsingFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int num = sc.nextInt();
        int rev = 0;
        for (int temp = num; temp != 0; temp /= 10) {
            int digit = temp % 10;
            rev = (rev*10)+digit;
        }
        System.out.println("Reverse of " + num + " is " + rev);
    }
}