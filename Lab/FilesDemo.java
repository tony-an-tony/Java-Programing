package oopj24lab71;
import java.io.*;
import java.util.*;
public class FilesDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		try {
			File f= new File("sample.txt");
			if(f.exists()) {
				System.out.println("sample.txt exixts");
			}else {
				f.createNewFile();
			}
			System.out.println("Enter the String:");
			String content=sc.nextLine();
			FileWriter fw=new FileWriter("sample.txt");
			fw.write(content);
			System.out.println("Content written successfully\n");
			fw.close();
			File f1= new File("new-sample.txt");
			if(f1.exists()) {
				System.out.println("new-sample.txt exixts");
			}else {
				f1.createNewFile();
			}
			System.out.println("-------Content of smple.txt-------");
			FileReader fr=new FileReader("sample.txt");
			char[] sampleContent=new char[100];
			fr.read(sampleContent);
			System.out.println(sampleContent);
			System.out.println("\nContent copied from sample.txt to new-sample.txt\n");
			FileWriter fw1=new FileWriter("new-sample.txt");
			fw1.write(sampleContent);
			fw1.close();
			System.out.println("-------Content of new-smple.txt-------");
			FileReader fr1=new FileReader("new-sample.txt");
			char[] newsampleContent=new char[100];
			fr1.read(newsampleContent);
			System.out.println(newsampleContent);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
