package tasksOfExcercise2;
import java.util.*;
public class task22 {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int f1 = 0;
		int f2 = 1;
		int f3;
		int n = sc.nextInt();
		System.out.print(f1+" ");
		System.out.print(f2+" ");
		for(int i = 0;i<n;i++)
		{
			f3 = f1+f2;
			f1 = f2;
			f2 = f3;
			System.out.print(f3+" ");			
		}

	}

}
