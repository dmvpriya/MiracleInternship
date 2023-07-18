import java.util.Scanner;
public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s1 = sc.nextLine();
		String s2 = "";
		for(int i = 0;i<s.length();i++)
		{
			for(int j = 0;j<s1.length();j++)
			{
				if(s.charAt(i) == s1.charAt(j))
				{
					
					s2 += s.charAt(i)+" ";
					
				}
			}
		}
		System.out.println("The common characters are :"+s2);

	}

}
