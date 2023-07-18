package sample;
import java.util.*;
public class Task33Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int count = 0;
		int n = 1;
		while(0<=num && num<=100)
		{			
		n++;
		count = 0;
		for(int i = 1;i<=n;i++)
		{
			
			if(n%i==0)
			{
				count++;
			}
		}
		if(count == 2)
		{
			System.out.println(n);
			num++;
		}
		
		}

	}

}
