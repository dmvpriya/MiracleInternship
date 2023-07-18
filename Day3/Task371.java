package tasksOfExcercise2;
import java.util.*;
import java.lang.*;
public class Task371 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		double num = 0.0;
		int sum = 0;
		String s = Integer.toString(n);
		double l = s.length();
		for(int i = 0;i<l;i++)
		{
			num = n%10;
			sum += (int)Math.pow(num, l);
			n = n/10;
		}
		System.out.println(sum);
		if(sum == temp)
		{
			System.out.println("Yes");
		}
		else {
			System.out.println("NO");
		}

	}

}
