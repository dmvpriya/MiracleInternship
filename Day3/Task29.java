package tasksOfExcercise2;

import java.util.*;
public class Task29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		String h = "";
		String g = "";
		String s = Integer.toString(num);
		for(int i = 0;i<s.length();i++)
		{
			count = 1;
			for(int j = i+1;j<s.length();j++)
			{
				if(s.charAt(i)== s.charAt(j))
				{
					count++;
					h = h + s.charAt(i)+ " ";
					
				}
			}
			g = g + count +"";
			
		}
		
		System.out.println(h);		
		System.out.println(g);
		
	}

}
