/*program to calculate the sum of all elements in an integer array
written by:Tony Antony.*/
package Tutorial4;
import java.util.*;
public class SumofArrayElemnts {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of elements in the array:");
		int n=sc.nextInt();
		int s=0;
		int[] array=new int[n];
		System.out.print("Enter elements:");
	    for(int i=0;i<n;i++){
	    	array[i]=sc.nextInt();
	    	}
		System.out.print("Given Array: ");
        for(int i=0;i<n;i++){
        	System.out.print(array[i]+" ");
		    s=s+array[i];
        	}
        System.out.print("\nsum of the elements:"+" "+s);
	}
}
