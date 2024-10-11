/*Program to find the maximum element in eachh row of a given 3D matrix and returns the reesult in a seperate array.
 * written by: Tony Antony*/
package Tutorial5;
import java.util.Scanner;
public class LargestInRow{
	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.print("Enter no of rows: ");
       int rows=s.nextInt();
       System.out.print("Enter no of cols: ");
       int cols=s.nextInt();
       int[][] matrix=new int[rows][cols];
       System.out.println("Enter elements: ");
       for(int i=0;i<rows;i++){
    	   for(int j=0;j<cols;j++){
    		   matrix[i][j]=s.nextInt();
    	   }
       }
       System.out.println("Given matrix is:");
       for(int i=0;i<rows;i++){
    	   for(int j=0;j<cols;j++){
    		   System.out.print(matrix[i][j]+" ");
    	   }
    	   System.out.print("\n");
       }
       System.out.println("Max no of elements in each row:");
       for(int i=0;i<rows;i++){
		   int max=matrix[i][0];
    	   for(int j=0;j<cols;j++){
    		   if(matrix[i][j]>max){
    			   max=matrix[i][j];
    		   }
    	   }
    	   System.out.println("Row"+(i+1)+":"+max);
       }
	}
}