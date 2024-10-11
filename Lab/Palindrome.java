package oopj24lab71;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str= new String();
		System.out.print("Enter a string:");
		str = sc.nextLine();
		int flag = 0;
		int len =str.length();
		for(int i=0;i<len/2;i++) {
			if(str.charAt(i) != str.charAt(len-i-1)) {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.print(str+" is palindrome");
		}else {
			System.out.print(str+" is not palindrome");
		}

	}

}