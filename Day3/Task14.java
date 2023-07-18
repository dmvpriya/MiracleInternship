package tasksOfExcercise2;
import java.util.*;
public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int n = sc.nextInt();
		int i = 0;
		System.out.println("The n even numbers are :");
		System.out.println("Using while :");
		while(i<=n)
		{
			if(i%2 == 0)
			{
				System.out.println(i);
				
			}
			i++;
			
		}
		i = 0;
		System.out.println("Using for :");
		for(int j = 0;j<=n;j++)
		{
			if(j%2 == 0)
			{
				System.out.println(j);
			}
			
		}
		System.out.println("Using do-while :");
		
		do {
			if(i%2 == 0)
			{
				System.out.println(i);
			}
			i++;
		}while(i<=n);

	}

}
