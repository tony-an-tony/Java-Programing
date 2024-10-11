/*program to read a given string and return the string without 
the first or last characters if they are the same, otherwise return the string 
without the characters. 
Written By: TONY ANTONY.*/
package Tutorial6;
import java.util.*;
public class WithoutFirstandLastIfSame {
	public static void main(String[] args) {
		String str1,str2,str3="";
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a string: ");
		str1 = sc.nextLine();
		str2 = str1.toLowerCase();
		if(str2.charAt(0)==str2.charAt(str2.length()-1)){
			System.out.print("The first and last characters are same");
		}else {
			System.out.print("first and last characters are not same.");
		}
		for(int i=1;i<str2.length()-1;i++) {
			str3=str3+str2.charAt(i);
		}
		System.out.print("\nString without the first and last characters: "+str3);
	}
}
