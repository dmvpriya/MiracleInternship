package sample;
import java.util.*;
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "";
		int count = 0;
		
			for(int i = 0;i<=100;)
			{
				
				count = 0;
				for(int j = 1;j<=i/2;j++)
				{
					if(i%j == 0)
					{
						count++;
					}
				}
				if(count == 1)
				{
					s = s +" "+ i +" ";
					i++;
				}
			}
			
		
		System.out.println("The prime numbers are :"+s);
		

	}

}