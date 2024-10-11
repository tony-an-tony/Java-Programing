package Tutorial11;
import java.util.*;
import Tutorial11.sub.EvenPackage;
public class CheckEven {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number");
        int num = sc.nextInt();
        boolean result = EvenPackage.isEven(num);
        if (result) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is not even.");
        }
    }
}

