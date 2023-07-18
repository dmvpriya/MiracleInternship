import java.util.Scanner;
public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String reverseS = " ";
		int  l = s.length();
		for(int i = s.length()-1;i>=0;i--)			
		{
			
				reverseS += reverseS + s.charAt(i);			
			
		}
		System.out.println("The reverse String is :"+reverseS);

	}

}
