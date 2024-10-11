/*program to count the total no. of chars, words, lines, alphabets, 
digits,white spaces in a given string.
Written by: Tony Antony.*/
package Tutorial6;
import java.util.*;
public class CountAll {
	public static void main(String[] args) {
		String str;
		int i,lines=1,words=0,spaces=0,alphabets=0,digits=0;
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a string :");
		str = sc.nextLine();
		for(i=0;i<str.length()-1;i++) {
			if(str.charAt(i)=='\0'||str.charAt(i)=='.'||str.charAt(i)==','||str.charAt(i)=='\n'||str.charAt(i)==' '){
				words++;
			}if(str.charAt(i)=='\n') {
				lines++;
			}if(str.charAt(i)>='a'&& str.charAt(i)<='z'|| str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')  {
				alphabets++;
			}if(str.charAt(i)>='0'&& str.charAt(i)<='9') {
				digits++;
			}if(str.charAt(i)==' '){
				spaces++;
			}
		}
		System.out.print("Charcters: "+str.length()+"\nWords: "+(words+1)+"\nLines: "+lines+"\nalphabets: "+alphabets+"\nDigits: "+digits+"\nSpaces: "+spaces);
	}
}
