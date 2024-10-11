/*program that performs matrix addition for two-dimensional arrays.
written by;Tony Antony.*/
package Tutorial4;
import java.util.*;
public class MatrixAddition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows for matrix1 :");
        int row1=sc.nextInt();
        System.out.print("Enter no of cols for matrix1 :");
        int col1=sc.nextInt();
        System.out.print("Enter no of rows for matrix2 :");
        int row2=sc.nextInt();
        System.out.print("Enter no of rows for matrix2 :");
        int col2=sc.nextInt();
        if(row1==row2 && col1==col2) {
        	int[][] matrix1=new int[row1][col1];
            System.out.print("Enter elements of matrix1:\n");
            for(int i=0;i<row1;i++) {
          	  for(int j=0;j<col1;j++) {
          		  matrix1[i][j]=sc.nextInt();
          	  } 
          	 }
            System.out.print("Given Matrix1:\n");
            for(int i=0;i<row1;i++) {
          	  for(int j=0;j<col1;j++) {
          		  System.out.print(matrix1[i][j]+" "); 
          	  }
          	      System.out.print("\n");
            }
            int[][] matrix2=new int[row2][col2];
            System.out.print("Enter elements of matrix2:\n");
            for(int i=0;i<row2;i++) {
          	  for(int j=0;j<col2;j++) {
          		  matrix2[i][j]=sc.nextInt();
          	  }
          	}
            System.out.print("Given Matrix1:\n");
            for(int i=0;i<row2;i++) {
          	  for(int j=0;j<col2;j++) {
          		  System.out.print(matrix2[i][j]+" ");  
          		  }
          	      System.out.print("\n");  
          		}
            int[][] result=new int[row1][col1];
            for(int i=0;i<row1;i++) {
            	for(int j=0;j<col1;j++) {
            		result[i][j]=matrix1[i][j]+matrix2[i][j];
            	}
            }
            System.out.print("Resultant matrix :\n");
            for(int i=0;i<row1;i++) {
            	for(int j=0;j<col1;j++) {
            		System.out.print(result[i][j]+" ");
            		}
            		System.out.print("\n");
            		}
        }else {
        	System.out.println("Matrix addition not possible");  
        	}
	}
}


