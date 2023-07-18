package tasksOfExcercise2;
import java.util.*;
public class Task18 {

	public static void main(String[] args) {
		// TODO Aut1o-generated method stub
		Scanner sc = new Scanner(System.in);
		Double sum = 0.0;
		int a = sc.nextInt();
		for(int i = 0;i<=a;i++)
		{
			sum = sum + (double)1/2*i;
		}
		System.out.println("The sum of the series is : "+sum);

	}

}
