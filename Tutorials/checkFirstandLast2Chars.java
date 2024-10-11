/*program to check whether the first two characters appear at 
the end of a given string.
Written By:TONY ANTONY.*/
package Tutorial6;
import java.util.*;
public class checkFirstandLast2Chars {
	public static void main(String[] args) {
		String str1,str2;
		Scanner sc = new Scanner  (System.in);
		System.out.print("Enter a string: ");
		str1 = sc.nextLine();
		str2 = str1.toLowerCase();
		int len = str2.length();
		if (str2.charAt(0) == str2.charAt(len - 2) && str2.charAt(1) == str2.charAt(len - 1)) {
		    System.out.print("First two characters appear at the end of the given string.");
		} else {
		    System.out.print("First two characters don't appear at the end of the given string.");
		}
	}
}
