/*program that finds the maximum and minimum values in an array of
integers.
written by:Tony Antony.*/
package Tutorial4;
import java.util.*;
public class MaxMinofArray {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter no of elements in the array:");
		int n=sc.nextInt();
		int[] array=new int[n];
		System.out.print("Enter elements:");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
			}
		System.out.print("Given Array: ");
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+" ");
			}
		int max=array[0];  
		System.out.print("\nThe maximum element: ");
		for(int i=0;i<n;i++) {
			if(max<array[i]) {
				max=array[i]; 
				}
			} System.out.print(max);
		int min=array[0];
		System.out.print("\nThe minimum element: ");
		for(int i=0;i<n;i++) {
			if(min>array[i]) {
				min=array[i]; 
				}
			} 
		System.out.print(min);
	}
}

