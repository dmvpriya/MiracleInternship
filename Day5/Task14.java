import java.util.Scanner;
public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String reverseS = "";
		int  l = s.length();
		for(int i = s.length()-1;i>=0;--i)			
		{
			
				reverseS += s.charAt(i);			
			
		}
		if(s.toLowerCase().equals(reverseS.toLowerCase()))
		{
			System.out.println("yes it is a palindrome");
		}
		else {
			System.out.println("no it is a palindrome");
		}

	}

}
