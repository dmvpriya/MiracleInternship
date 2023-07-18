package sample;
import java.util.*;
public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String m = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int count = 0;
		int count1 = 0;
		s = s.toUpperCase();
		for(int i = 0;i<s.length();i++)
		{
			if(s.charAt(i) == m.charAt(0)||s.charAt(i) == m.charAt(4)||s.charAt(i) == m.charAt(8)||s.charAt(i) == m.charAt(14)||s.charAt(i) == m.charAt(20))
			{
				count ++;
			}
			else {
				count1 ++;
			}
		}
		System.out.println("The number of vowels are :"+count);
		System.out.println("The number of consonants are :"+count1);

	}

}
