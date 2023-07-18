package tasksOfExcercise2;
import java.util.*;
public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a month :");
		int a = sc.nextInt();
		int year =sc.nextInt();
		if (a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12)
		{
			System.out.println("31");
			
		}
		else if((a == 2)&& (year%4 == 0) || (year%100 == 0)&& (year%400 == 0))
		{
			System.out.println("29");
		}
		else if (a == 2)
		{
			System.out.println("28");
		}
		else 
		{
			System.out.println("30");
		}
		

	}

}
