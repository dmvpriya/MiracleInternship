package tasksOfExcercise2;
import java.util.*;
public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		if(a%3 == 0)
		{
			if(a%5 ==0)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		}
		else {
			System.out.println("NO");
		}

	}

}
