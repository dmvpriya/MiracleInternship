package tasksOfExcercise2;
import java.util.*;
public class Task372 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(int i = 1;i<=n/2;i++)
		{
			if(n%i == 0)
			{
				count += i ;
			}
			
		}
		System.out.println(count);
		if(count == n)
		{
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
