import java.util.*;
public class Task92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.replace(s.charAt(0),s.charAt(s.length()-1));
		for(int i = 0;i<s.length();i++)
		{
			if(s.charAt(i) == ' ')
			{
				s = s.replace(s.charAt(i+1), s.charAt(i-1));
			}
		}
		System.out.println(s);
		

	}

}
