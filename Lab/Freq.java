package oopj24lab71;
import java.util.*;
public class Freq {

	public static void main(String[] args) {
		System.out.print("Enter the string:");
		Scanner sc=new  Scanner(System.in);
		String str = sc.nextLine();
		String str1=str.toLowerCase();
		System.out.print("Enter the character: ");
		char ch = sc.next().charAt(0);
		int freq=0,l=str.length();
		for(int i=0;i<l;i++) {
			if(str.charAt(i)==ch) {
				freq++;
			}
		}
		System.out.print(ch+" occur "+freq+" times in "+str); 

	}

}