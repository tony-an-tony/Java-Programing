/*Program to find the maximum element in eachh row of a given 3D matrix and returns the reesult in a seperate array.
 * written by: Tony Antony*/
package Tutorial5;
import java.util.Scanner;
public class MakeIdentity{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.print("Enter size of matrix(n for nxn matrix :");
        int x=s.nextInt();
        System.out.println("identity matrix of size "+ x +" is:");
        int[][] matrix=new int[x][x];
        for(int i=0;i<x;i++){
        	for(int j=0;j<x;j++){
        		if(i!=j){
        			matrix[i][j]=0;
        		}
        		else{
        			matrix[i][j]=1;
        		}
        		System.out.print(matrix[i][j]+"\t");
        	}
        	System.out.print("\n");
        }
	}
}