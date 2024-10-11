package Tutorial10;
import java.util.*;
class InvalidScoreException extends Exception {
	private String msg;
    public InvalidScoreException(String msg) {
        this.msg=msg;
    }
    public String getMessage() {
    	return msg;
    }
}
public class CustomStudent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the score of the student");
		int score=sc.nextInt();
		try {
			if(score<0||score>100) {
				throw new InvalidScoreException("Score must be between 0-100.");
			}else {
				System.out.println("Score of the student"+score);
			}
		}catch(InvalidScoreException e) {
			System.out.println(e.getMessage());
		}
	}
}
