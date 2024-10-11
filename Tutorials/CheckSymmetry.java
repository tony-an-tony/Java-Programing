/*Program to find the maximum element in eachh row of a given 3D matrix and returns the reesult in a seperate array.
 * written by: Tony Antony*/
package Tutorial5;
import java.util.Scanner;
public class CheckSymmetry{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter size of matrix (n for nxn matrix) ;");
		int x=s.nextInt();
		System.out.println("Enter Elements:");
		
		int[][] matrix=new int[x][x];
		for(int i=0;i<x;i++){
			for(int j=0;j<x;j++){
				matrix[i][j]=s.nextInt();
			}
		}
		System.out.println("The matrix is:");
		for(int i=0;i<x;i++){
			for(int j=0;j<x;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.print("\n");
		}
		int flag=1;
		for(int i=0;i<x;i++){
			for(int j=0;j<x;j++){
				if(matrix[i][j]!=matrix[j][i]){
					flag=0;
					break;
				}
			}
		}
		if(flag==1){
			System.out.print("Matrix is symmetric");
		}
		else{
			System.out.print("Matrix is not symmetric");
		}
	}
}