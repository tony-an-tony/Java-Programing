package Tutorial10;
import java.util.Scanner;
class InvalidNumberException extends Exception {
	private String msg;
    public InvalidNumberException(String msg) {
        this.msg=msg;
    }
    public String getMessage() {
    	return msg;
    }
}
public class InvalidNumExptn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0,count=0;
        System.out.println("Enter limit");
        int lim=sc.nextInt();
        int[] arr=new int[lim];
        System.out.println("Enter "+lim+" numbers");
        for(int i=0;i<lim;i++) {
        	arr[i]=sc.nextInt();
        }
        System.out.println("The numbers are");
        for(int i=0;i<lim;i++) {
        	try {
            	if(arr[i]>0) {
            		System.out.println(arr[i]);
            		sum+=arr[i];
            		count++;
            	}else {
            		throw new InvalidNumberException("invalid number"+arr[i]);
            	}
        	}catch(InvalidNumberException e) {
        		System.out.println(e.getMessage());
        	}
        }if(count>0) {
        	System.out.println("The sum of positive numbers:"+sum);
        	float avg=sum/count;
        	System.out.println("The average is:"+avg);
        }
    }
}