package tasksOfExcercise2;
import java.util.*;
import java.lang.*;
public class Task23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		int temp=0;
		a = Math.abs(a);
		String digit = Integer.toString(a);
		int highestDigit = -1;
		for(int i = 0;i<digit.length();i++)
		{
			if(a>0)
			{
				temp = a%10;
			}
			if(temp > highestDigit)
			{
				highestDigit = temp;
			}
			a = a/10;
		}
		System.out.println("The biggest digit is :"+highestDigit);

	}

}
