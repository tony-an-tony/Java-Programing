/*program to compute the transpose of a given matrix.
written by:Tony Antony.*/
package Tutorial4;
import java.util.*;
public class Transpose {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      System.out.print("Enter no of rows: ");
	      int rows=sc.nextInt();
	      System.out.print("Enter no of cols: ");
	      int cols=sc.nextInt();
	      System.out.print("Enter elements:\n");
	      int matrix[][]=new int[rows][cols];
	      for(int i=0;i<rows;i++) {
	    	  for(int j=0;j<cols;j++) {
	    		  matrix[i][j]=sc.nextInt();
	    	  }
	      }
	      System.out.print("Given Matrix :\n");
	      for(int i=0;i<rows;i++) {
	    	  for(int j=0;j<cols;j++) {
	    		  System.out.print(matrix[i][j]+" ");
	    	  }
	    	  System.out.print("\n"); }
	      int transpose[][]=new int[rows][cols];
	      for(int i=0;i<rows;i++)  {
	    	  for(int j=0;j<cols;j++)  {
	    		  transpose[i][j]=matrix[j][i];
	    	  } }
	      System.out.print("Transposed matrix :\n");
	      for(int i=0;i<cols;i++) {
	    	  for(int j=0;j<rows;j++) {
	    		  System.out.print(transpose[i][j]+" "); }
	    	  	  System.out.print("\n"); }
	}
}
