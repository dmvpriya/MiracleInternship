package sample;
import java.util.*;
public class Task33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		String s = "";
		int count = 0;
		int l = s.length();
		int j = 1;
			for(int i = 2;i<=n;i++)
			{
				count = 0;
				for(j = 1;j<=i/2;j++)
				{
					if(i%j == 0)
					{
						count++;
					}
				}
				if(count == 1)
				{
					s = s +" "+ i +" ";
					n++;
				}
				
				
				
			
			
		}
		System.out.println("The prime numbers are :"+s);
		

	}

}
