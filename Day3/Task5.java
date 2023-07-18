package tasksOfExcercise2;
import java.util.*;
public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		float avg = (a+b)/2;
		if(avg<=5)
		{
			System.out.println("Fail");
		}
		else if(avg>=6 && avg<=7)
		{
			System.out.println("D");
		}
		else if(avg>=7 && avg<=8)
		{
			System.out.println("C");
		}
		else if(avg>=8 && avg<=9)
		{
			System.out.println("B");
		}
		else
		{
			System.out.println("A");
		}
		
		
	}

}
