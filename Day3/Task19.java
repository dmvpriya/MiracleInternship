package tasksOfExcercise2;
import java.util.*;
import java.lang.*;
public class Task19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double s = 1.0;
		int x = sc.nextInt();
		int a = sc.nextInt();
		double sum = 1.0;
		for(int i = 1;i<=a;i++)
		{
			sum = sum + (Math.pow(x,i)/i);
		}
		System.out.println("The sum of the series is : "+sum);
		

	}

}
