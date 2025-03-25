package oopj24lab71;
import java.io.*;
import java.util.*;
public class FileOperationsDemo {
	public static void main(String[] args) throws IOException  {
		Scanner sc = new Scanner (System.in);
		File f= new File("number.txt");
		if(f.createNewFile()){
			System.out.println("number.txt created");
		}
		File f1= new File("even.txt");
		if(f1.createNewFile()) {
			System.out.println("even.txt created");
		}
		File f2= new File("even.txt");
		if(f2.createNewFile()) {
			System.out.println("odd.txt created");
		}
		try {
			System.out.println("Enter no of elements");
			int count=sc.nextInt();
			FileOutputStream fo=new FileOutputStream("number.txt");
			System.out.println("Enter numbers");
			for(int i=0;i<count;i++) {
				int num=sc.nextInt();
					String str=Integer.toString(num);
				fo.write(str.getBytes());
				fo.write("\n".getBytes());
			}
			fo.close();
			System.out.println("file written succcessfully");
			
			FileInputStream fi=new FileInputStream("number.txt");
			InputStreamReader ir= new InputStreamReader(fi);
			BufferedReader br= new BufferedReader(ir);
			
			FileOutputStream feven =new FileOutputStream("even.txt");
			FileOutputStream fodd = new FileOutputStream("odd.txt");
			
			String chn;
			System.out.println("content of number.txt");
			while((chn=br.readLine())!=null){
				System.out.println(chn);
				int number =Integer.parseInt(chn);
				if(number%2==0) {
					feven.write(Integer.toString(number).getBytes());
					feven.write("\n".getBytes());
				}else {
					fodd.write(Integer.toString(number).getBytes());
					fodd.write("\n".getBytes());
				}
						
			}
			fodd.close();
			feven.close();
			System.out.println("odd and even numbers have written seperately"
					+" to even.txt and odd.txt");
			
			FileInputStream fi1=new FileInputStream("odd.txt");
			InputStreamReader ir1= new InputStreamReader(fi1);
			BufferedReader br1= new BufferedReader(ir1);
				
			FileInputStream fi2=new FileInputStream("even.txt");
			InputStreamReader ir2= new InputStreamReader(fi2);
			BufferedReader br2= new BufferedReader(ir2);
				
			System.out.println("content of odd.txt");
			while((chn=br1.readLine())!=null){
			System.out.println(chn);
			}
			
			System.out.println("content of even.txt");
			while((chn=br2.readLine())!=null){
				System.out.println(chn);
			}
				
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}