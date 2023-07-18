package tasksOfExcercise2;
import java.util.*;
public class Task361 {

	public static void main(String[] args) {
		// TODO Auto-generated meth1od stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = n;
		int number = 1;
		for(int i = 0;i<=n;i++)
		{
			for(int k = 1;k<=s;k++)
			{
				System.out.println(" ");
			}
			number = 1;
			for(int j = 0;j<=i;j++)
			{
				System.out.print(number + " ");
				number = number*(i-j)/(1+j);
			}
			System.out.println();
			s--;
		}

	}

}
