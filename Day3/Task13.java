package tasksOfExcercise2;
import java.util.*;
public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int n = sc.nextInt();
		int sum = 0;
		System.out.println("The n even numbers are :");
		for(int i = 0;i<=n;i++)
		{
			if(i%2 == 0)
			{
				sum +=i;
				
			}
			
		}
		System.out.println(sum);

	}

}
