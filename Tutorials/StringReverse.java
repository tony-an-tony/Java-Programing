/*program which accepts a string from the user and display the 
reverse of it. 
Written By: TONY ANTONY.*/
package Tutorial6;
import java.util.*;
public class StringReverse {
	public static void main(String[] args) {
		String str,rev="";
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a string");
	    str = sc.nextLine();
		System.out.print("Given string is :"+str+"\n");
		int len = str.length();
		for(int i=len-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		System.out.print("Reversed string is :"+rev);
	}
}
