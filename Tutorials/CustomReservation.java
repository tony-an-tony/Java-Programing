package Tutorial10;
import java.util.*;
class InvalidReservationException extends Exception {
	private String msg;
    public InvalidReservationException(String msg) {
        this.msg=msg;
    }
    public String getMessage() {
    	return msg;
    }
}
public class CustomReservation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter slot");
		int slot=sc.nextInt();
		try {
			if(slot<=0) {
				throw new InvalidReservationException("Invalid slot!!");
			}else {
				System.out.println("Slot Registeredd successfully.");
			}
		}catch(InvalidReservationException e) {
			System.out.println(e.getMessage());
		}
	}
}
