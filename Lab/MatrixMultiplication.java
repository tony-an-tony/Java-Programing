package oopj24lab71;
import java.util.*;
public class MatrixMultiplication {

	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		int[][] matrix1 = new int [5][5];
		int[][] matrix2 = new int [5][5];
		int[][] matrix3 = new int [5][5];
		
		int r1,r2,c1,c2;
		System.out.print("Enter no of rows and coloumns in matrix 1:");
		r1 = sc.nextInt();
		c1 = sc.nextInt();
		System.out.print("Enter no of rows and coloumns in matrix 2:");
		r2 = sc.nextInt();
		c2 = sc.nextInt();
		if(c1!=r2) {
			System.out.print("Multiplication not possible for these matrices");
			return;
		}
		System.out.println("Enter elements of Matrix1");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter elements of Matrix2");
		for(int i=0;i<r2;i++) {
			for(int j=0;j<c2;j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}
		System.out.println("first matrix is:");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				System.out.print(matrix1[i][j]+"\t"); 
			}
			System.out.print("\n"); 
		}
		System.out.println("second matrix is:");
		for(int i=0;i<r2;i++) {
			for(int j=0;j<c2;j++) {
				System.out.print(matrix2[i][j]+"\t"); 
			}
			System.out.print("\n"); 
		}

		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				matrix3[i][j] = 0;
				for(int k=0;k<c1;k++) {
					matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		System.out.println("Product Matrix;");
		for(int i=0;i<r1;i++) {
			for(int j =0;j<c2;j++) {
				System.out.print(matrix3[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}

}
