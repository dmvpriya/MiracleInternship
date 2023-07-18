package tasksOfExcercise2;
import java.util.*;
public class Task21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		int count = 0;
		for(int i = 1;i<=a/2;i++)
		{
			if(a%i == 0)
			{
				count += i;
			}
			
		}
		if(count == a)
		{
			System.out.println("It is a perfect number");
		}
		else {
			System.out.println("It is not a perfect number");
		}

	}

}
