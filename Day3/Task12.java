package tasksOfExcercise2;
import java.util.*;
public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int n = sc.nextInt();
		int count =0;
		System.out.println("The n even numbers are :");
		for(int i = 0;i<=n;i++)
		{
			for(int j = 1;j<=i;j++)
			{	
				if(j%2 == 0)
			   {
				System.out.println(j);
			   }
			}
			
		}

	}

}
