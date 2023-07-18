import java.util.Scanner;
public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s1 = sc.nextLine();
		String s2 = "";
		String s3 = "";
		String s4 = "";
		String s5 = "";

		for(int i = 0;i<s.length();i++)
		{
			for(int j = 0;j<s1.length();j++)
			{
				if(s.charAt(i) == s1.charAt(j))
				{
					s2  += s.replace(s.charAt(i),' ');
					s3  += s1.replace(s.charAt(j),' ');
				}
			}
		}
		for(int i = 0;i<s.length();i++)
		{
			if(s.charAt(i) == ' ')
			{
				s4 = s.substring(0, i-1)+s.substring(i+1);
				s5 = s1.substring(0, i-1)+s1.substring(i+1);
				
			}
		}
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);

	}

}
