package Tutorial8;
import java.util.Scanner;
class stackmenu{
    int item,n,top;
    int[] A;
    stackmenu(int size) {
        this.n = size;
        this.top = -1;
        this.A = new int[n];
    }
    void push(int item){
        if(top==n-1){
            System.out.print("Overflow!!!\n");
        }
        else{
            top++;
            this.item=item;
            A[top]=item;
            System.out.print(A[top]+" added\n");
        }
    }
    void pop(){
        if(top==-1)
        {
            System.out.print("Underflow!!!\n");
        }
        else{this.item=A[top];
            System.out.print(item+" deleted\n");
            top--;
        }
    }
    void full(){
        if(top==n-1){
            System.out.println("Stack is full");
        }
        else if(top==-1){
            System.out.println("Stack is empty");
        }
    }
    void print(){
    	if (top==-1) {
    		System.out.print("Stack is empty");
    	}else {
    		for(int i=0;i<=top;i++) {
    			System.out.print(A[i]+"\t");
    		}
    	}
    }
}
public class Stack {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        char choice;
        int option;
        System.out.print("Enter size of stack:");
        int size=sc.nextInt();
        stackmenu obj=new stackmenu(size);
        do{
            System.out.print("STACK OPERATIONS\n");
            System.out.print("1.PUSH\n2.POP\n3.FULL/EMPTY\n4.DISPLAY");
            System.out.print("\nEnter option: ");
            option=sc.nextInt();
            switch(option){
                case 1:
                    System.out.print("Enter element to be inserted:");
                    int item=sc.nextInt();
                    obj.push(item);
                    break;
                case 2:
                    obj.pop();
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
            System.out.print("Do you want to continue(Y/N): ");
            choice=sc.next().charAt(0);
        }while(choice=='Y'||choice=='y');
        System.out.println("Exiting...");
	}
}