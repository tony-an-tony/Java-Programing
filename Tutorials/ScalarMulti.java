/*Program to find the maximum element in eachh row of a given 3D matrix and returns the reesult in a seperate array.
 * written by: Tony Antony*/
package Tutorial5;
import java.util.Scanner;
public class ScalarMulti {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int rows=s.nextInt();
        System.out.print("Enter no of cols: ");
        int cols=s.nextInt();
        int[][] mat=new int[rows][cols];
        System.out.println("Enter Elements:");
        for(int i=0;i<rows;i++){
        	for(int j=0;j<cols;j++){
        		mat[i][j]=s.nextInt();
        	}
        }
        System.out.println("Given Matrix :");
        for(int i=0;i<rows;i++){
        	for(int j=0;j<cols;j++){
        		System.out.print(mat[i][j]+" ");
        	}
        	System.out.print("\n");
        }
        System.out.print("Enter a scalar value:");
        int scal=s.nextInt();
        System.out.println("The resulting matrix is:");
        for(int i=0;i<rows;i++){
        	for(int j=0;j<cols;j++){
        		mat[i][j]=mat[i][j]*scal;
        		System.out.print(mat[i][j]+" ");
        	}
        	System.out.print("\n");
        }
	}
}