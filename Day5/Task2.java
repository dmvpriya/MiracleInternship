package sample;
import java.util.*;
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 1;
		int count1 = 0;
		for(int i = 0;i<s.length();i++)
		{
			if(s.charAt(i) == ' ')
			{
				count++;
			}
			else {
				count1++;
			}
			
			
		}
		
		System.out.println("The words are : "+count);
		System.out.println("The characters are : "+count1);

	}

}
