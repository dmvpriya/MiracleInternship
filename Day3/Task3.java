package tasksOfExcercise2;
import java.util.*;
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		int a = sc.nextInt();
		if(a%4==0)
		{
			if(a%100 == 0)
			{
				if(a%400 == 0)
				{
					System.out.println("leapYear");
				}
				else
				{
					System.out.println("not a leapYear");
				}
			}
			else {
				System.out.println("leapYear");
			}
		}
		else {
			System.out.println("not a LeapYear");
		}

	}

}
