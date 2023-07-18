package tasksOfExcercise2;
import java.util.*;
import java.lang.*;
public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char s = sc.next().charAt(0);
		if(Character.isDigit(s)) {
			System.out.println("Digit");
		}
		else if(Character.isUpperCase(s))
		{
			System.out.println("Upper");
		}
		else if(Character.isLowerCase(s))
		{
			System.out.println("Lower");
		}
		else
		{
			System.out.println("Special Character");
		}

	}

}
