package oopj24lab71;
import java.util.*;
public class TokenizerDemo{
	public static void main(String args[]) {
		int n;
		int sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integers with one space gap:");
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		while (st.hasMoreTokens()){
			String temp = st.nextToken();
			System.out.println(temp);
			sum+=Integer.parseInt(temp);
		}
		System.out.println("sum of the integers is: " + sum);
		sc.close();
	}
}