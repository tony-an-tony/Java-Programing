package oopj24lab71;
import java.util.*;
class SqrThrd extends Thread{
	int n;
	SqrThrd(int n){
		this.n=n;
	}
	public void run(){
			System.out.println("Square of "+n+" = "+n*n);
	}
}
class CubeThrd extends Thread{
	int n;
	CubeThrd(int n){
		this.n=n;
	}
	public void run() {
			System.out.println("Cube of "+n+" = "+n*n*n);
	}
}
class RandThrd extends Thread{
	public void run() {
		Random robj=new Random();
		int[] arr=new int[10];
		try {
			for (int i=0;i<10;i++) {
				arr[i]=robj.nextInt(100);
				if (arr[i]%2!=0) {
					CubeThrd c=new CubeThrd(arr[i]);
					c.start();
					sleep(1000);
				}
				else if(arr[i]%2==0) {
					SqrThrd s=new SqrThrd(arr[i]);
					s.start();
					sleep(1000);
				}
			}
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
public class SqrCubeThrdDemo {
	public static void main(String[] args) {
		RandThrd r=new RandThrd();
		r.start();
	}

}
