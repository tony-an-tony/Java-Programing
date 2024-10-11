/*program to calculate the sum of both diagonals of a square matrix.
written by:Tony Antony.*/
package Tutorial4;
import java.util.*;
public class SumofDiagonals {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.print("Enter size of sqr matrix: ");
        int n=sc.nextInt();
		int[][] matrix=new int[n][n];
        System.out.print("Enter elements:");
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		matrix[i][j]=sc.nextInt();
				}
        	}
        System.out.print("Given Matrix :\n");
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		System.out.print(matrix[i][j]+" ");
				}
        	System.out.print("\n"); 
			}
        int dia1=0,dia2=0;
        for(int i=0;i<n;i++) {
        	dia1=dia1+matrix[i][i];
        	dia2=dia2+matrix[i][n-i-1]; 
			}
        System.out.println("The sum of the first diagonal is"+" "+dia1);
        System.out.println("The sum of the second diagona2 is"+" "+dia2);
	}
}
