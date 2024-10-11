package Tutorial8;
import java.util.Scanner;
class Queuemenu{
    int[] Q;
    int fr,re,size;
    Queuemenu(int size){
        this.Q=new int[size];
        this.size=size;
        re=-1;
        fr=0;
    }
    void enqueue(int item){
        if(re==size-1){
            System.out.print("Overflow!!!\n");
        }
        else{
            re++;
            Q[re]=item;
            System.out.print(Q[re]+" added\n");
        }
    }
    void dequeue(){
        if(fr==-1||re<fr){
            System.out.print("Underflow!!!\n");
        }
        else{
            System.out.print(Q[fr]+" deleted\n");
            fr++;
        }
    }
    void full(){
    	if(fr==-1||fr>re){
            System.out.print("Queue is empty\n");
        }
        else if(re==size-1){
            System.out.print("Queue is full\n");
        }
    }
    void print(){
        if(re<fr){
            System.out.print("The Queue is empty\n");
        }
        else{
            for(int i=fr;i<=re;i++){
                System.out.print(Q[i]+"\t");
            }
        }
    }
}
public class Queue {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        System.out.print("Enter size of Queue: ");
	        int size=sc.nextInt();
	        Queuemenu obj=new Queuemenu(size);
	        char choice;
	        int option;
	        do{
	            System.out.print("QUEUE OPERATIONS");
	            System.out.print("\n1.ENQUEUE\n2.DEQOEUE\n3.FULL/EMPTY\n4.DIAPLAY\n");
	            System.out.print("Enter the option:");
	            option=sc.nextInt();
	            switch(option){
	                case 1:
	                    System.out.print("Enter the element to insert:");
	                    int item=sc.nextInt();
	                    obj.enqueue(item);
	                    break;
	                case 2:
	                    obj.dequeue();
	                    break;
	                case 3:
	                    obj.full();
	                    break;
	                case 4:
	                    obj.print();
	                    break;
	                default:
	                    System.out.println("Invalid option");
	                    break;
	            }
	            System.out.print("Do you want to continue or not(Y/N): ");
	            choice=sc.next().charAt(0);
	        }while(choice=='y'||choice=='Y');
	        System.out.println("Exiting...");
	}
}