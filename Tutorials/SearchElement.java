/*program to search for a specific element in a two-dimensional array and
return its position.
written by:Tony Antpny.*/
package Tutorial4;
import java.util.*;
public class SearchElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int row=sc.nextInt();
        System.out.print("Enter no of cols: ");
        int col=sc.nextInt();
        System.out.print("Enter elements:\n");
        int matrix[][]=new int[row][col];
        for(int i=0;i<row;i++) {
      	  for(int j=0;j<col;j++) {
      		  matrix[i][j]=sc.nextInt();
      	  }
        }
        System.out.print("Given Matrix :\n");
        for(int i=0;i<row;i++) {
      	  for(int j=0;j<col;j++) {
      		  System.out.print(matrix[i][j]+" ");    
      		  }
      	  	  System.out.print("\n");
        }
        System.out.print("Enter search element :");
        int x=sc.nextInt();
        int flag=0;
        for(int i=0;i<row;i++) {
      	  for(int j=0;j<col;j++) {
      		  if(matrix[i][j]==x) {
      			 System.out.println("Element "+x+" found at ("+i+","+j+")");
      			 flag=1;
      			 break; 
      			 }
      		  }
      	  }
        if(flag==0) {
			  System.out.println("Element "+x+" is not found"); 	  
       }
	}
}


