package tasksOfExcercise2;
import java.util.*;
public class Task362 {

	public static void main(String[] args) {
		// TODO Auto-generated meth1od stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) 
		{
			if(i!=1)
			{
				for(int k = i;k>=2;k--)
				{
					System.out.println(k+"");
				}
			}
			for(int j = 1;j<=i;j++)
			{
				System.out.println(j+"");
			}
			System.out.println();
		}

	}

}
