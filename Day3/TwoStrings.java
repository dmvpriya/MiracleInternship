package sample;
import java.util.*;
public class TwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s = sc.nextLine();
		String l = sc.nextLine();
		int count = 0;
		if(s.length()==l.length())

		{
			for(int i = 0;i<s.length();i++)
			{
				if(s.charAt(i) != l.charAt(i))
				{ 
					break;
					
				}
				else {
					count++;
				}
			}
			if(count == s.length())
			{
				System.out.println("The 2 strings are equal");
			}
			else {
				System.out.println("The 2 strings are not equal");
			}
		}
		else
		{
			System.out.println("The lengths are not same probably teh Strings are not equal");
		}
	}

}
