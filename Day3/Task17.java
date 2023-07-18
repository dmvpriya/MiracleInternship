package tasksOfExcercise2;
import java.util.*;
public class Task17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double s = 0.0;
		int a = sc.nextInt();
		for(int i = 1;i<=a;i++)
		{
			s = s + (double)1/i;
		}
		System.out.println("The um of the series is : "+s);
		

	}

}
