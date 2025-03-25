package oopj24lab71;
import java.util.*;
class InvalidAmountException extends Exception{
	private String msg;
	InvalidAmountException(String msg){
		this.msg=msg;
	}
	public String getMessage() {
		return msg;
	}
}
class InsufficcientAmountException extends Exception{
	private String msg;
	InsufficcientAmountException(String msg){
		this.msg=msg;
	}
	public String getMessage() {
		return msg;
	}
}
class MyBank {
	public String accNo,accType,name;
	private long balance;
	Scanner sc= new Scanner(System.in);
	public  void openAcc() {
		System.out.print("Enter Acc.No:");
		this.accNo=sc.next();
		System.out.print("Enter Account type:");
		this.accType=sc.next();
		System.out.print("Enter Name:");
		this.name=sc.next();
		System.out.print("Enter balance:");
		this.balance=sc.nextLong();
	}
	public void display() {
		System.out.println("Name of account holder:"+name);
		System.out.println("Account No:"+accNo);
		System.out.println("Acccoumt Type:"+accType);
		System.out.println("Balance:"+balance);
	}
	public boolean search(String acno) {
		if(acno.equals(accNo)) {
			return true;
		}
		return false;
	}
	public void deposit() throws InvalidAmountException{
		System.out.println("Enter the amount to be deposited");
		int deposit = sc.nextInt();
		if (deposit<=0) {
			throw new InvalidAmountException("invalid amount, amount<=0");
		}else {
			balance+=deposit;
			System.out.println("balance="+balance);
		}
	}
	public void withdraw() throws InsufficcientAmountException,InvalidAmountException{
		System.out.println("Enter the amount to be withdrawed");
		int withdraw = sc.nextInt();
		if (withdraw<=0) {
			throw new InvalidAmountException("invalid amount, amount<=0");
		}else if(withdraw>balance) {
			throw new InsufficcientAmountException("Your balance is less than "+balance+"\nTransaction failed...!!");
		}else {
			balance-=withdraw;
			System.out.println("Balance after withdrawal:"+balance);
		}
	}
}
public class CustomExceptionDemo{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("How many number of customers");
		int n=sc.nextInt();
		MyBank ob[] = new MyBank[n];
		for(int i=0;i<n;i++) {
			ob[i]=new MyBank();
			ob[i].openAcc();
		}
		String ch="y";
		do {
			System.out.println("*****BANKING SOFTWARE*****");
			System.out.println("1. Display all account details \n2. Search by Account number\n"
					+ "3. Deposit the amount \n4. Withdraw the amount\n5. Exit");
			System.out.print("Enter option:");
			int op=sc.nextInt();
			switch (op){
				case 1:
					for(int i=0;i<n;i++) {
						ob[i].display();
					}
				break;
				case 2:
					System.out.print("Enter account no you want to search:");
					String acno=sc.next();
					int i;
					boolean found = false;
					for (i=0;i<n;i++) {
						if(ob[i].search(acno)) {
							found=true;
							break;
						}
					}
					if(found=true) {
						ob[i].display();
					}else {
						System.out.print("Account not Found!!");
					}
					break;
				case 3:
					System.out.print("Enter account no");
					acno=sc.next();
					found = false;
					for (i=0;i<n;i++) {
						if(ob[i].search(acno)) {
							found=true;
							break;
						}
					}try {
						if(found==true) {
							ob[i].deposit();
						}else {
							System.out.print("Account not Found!!");
						}
					}catch(InvalidAmountException f) {
						System.out.println(f.getMessage());
					}
					break;
				case 4:
					System.out.print("Enter account no");
					acno=sc.next();
					found = false;
					for (i=0;i<n;i++) {
						if(ob[i].search(acno)) {
							found=true;
							break;
						}
					}try {
						if(found==true) {
							ob[i].withdraw();
						}else {
							System.out.println("Account not Found!!");
						}
					}catch(InvalidAmountException e) {
						System.out.println(e.getMessage());
					}catch(InsufficcientAmountException c) {
						System.out.println(c.getMessage());
					}
					break;
				case 5:
					System.out.println("See you soon...\n\n"
							+ "*********************************\n"
							+ "Thank You :) Visit again\n"
							+ "*********************************");
					return;
					default:
						System.out.println("invalid option");
			}
		}while(true);
	}
}

