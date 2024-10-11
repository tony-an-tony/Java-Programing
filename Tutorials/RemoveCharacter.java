/*program that remove a given character from String.
Written By:TONY ANTONY.*/
package Tutorial6;
import java.util.*;
public class RemoveCharacter {
	public static void main(String[] args) {
		String str1,str2,str3="";
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a string");
		str1 = sc.nextLine();
		str2 = str1.toLowerCase();
		System.out.print("Enter a character :");
		char ch = sc.next().charAt(0);
		for(int i=0;i<str2.length();i++) {
			if(str2.charAt(i)!=ch) {
				str3 = str3 + str2.charAt(i);
			}
			}
		System.out.print("The string after removing "+ch+" is: "+str3);
		}
}
