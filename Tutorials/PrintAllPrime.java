/*program to print all prime numbers between 1 and 100 using a for loop and if-else statements.
written by:Tony Antony.*/
package Tutorial3;
import java.util.Scanner;
public class PrintAllPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Prime numbers between 1 to 100:");
		for(int num=2;num<=100;num++){
			int flag=1;
			for(int i=2;i<=(num/2);i++){
				if(num%i==0){
	    			   flag=0;
	    			   break;
	    		   }   
	    	   }
	    	   if(flag==1){
	    		   System.out.println(num);
	    	   }
	     }    
	}
}